import { Component } from '@angular/core';
import { NavController, AlertController, ModalController, LoadingController } from '@ionic/angular';
import { OtpPopUpComponent } from '../otpPopUp/otpPopUp.component';
import { OrganizerIdService } from 'src/app/services/apiservices/organizerId.service';
import { SocietyRoleService } from 'src/app/services/apiservices/societyrole.service';
import { RegisterService } from 'src/app/services/apiservices/register.service';
import { EventsService } from 'src/app/services/apiservices/events.service';
import { UtlityService } from 'src/app/services/apiservices/Utility.service';
import { StorageService } from 'src/app/services/apiservices/storage.service';
import { LoaderService } from 'src/app/services/apiservices/loader.service';
import { ConstantService } from 'src/app/services/apiservices/constant.service';

@Component({
  selector: 'register',
  templateUrl: 'register.page.html',
  styleUrls: ['register.page.scss'],
})
export class RegisterComponent {
  registervalidate=false;
  roles: any;
  data = {
    FirstName: "",
    LastName: "",
    EmailId: "",
    MobileNo: "",
    Pincode: "",
    Gender: false,
    Device: 3,
    Society: '',
    SocietyRole: ''
  }

  referenceCode: string = "";
  isLoading: boolean;

  constructor(private navCtrl: NavController, private alertCtrl: AlertController, private modalController: ModalController,
    public organizeIDService: OrganizerIdService, public loadingController: LoadingController, public societyRoleService: SocietyRoleService,
    public registerService: RegisterService, public eventsService: EventsService,private utlityService:UtlityService,
    private storageSerice:StorageService,private loaderService:LoaderService,private constantService:ConstantService) {

    if (this.storageSerice.getOrganizersDetails() === null) {
      this.loaderService.Loader();
      this.utlityService.log("No Organizer ID");
      this.getOrganizerID();
    }
    else {
      this.loaderService.Loader();
      organizeIDService.getOrganizerDetailsFromStorage();
      this.getSocietyRole();
      this.getEvents();
    }
  }

  getOrganizerID() {
    
    this.organizeIDService.getOrganizerIdFromUrl()
      .then((r) => {
        this.utlityService.log(r);
        this.getSocietyRole();
        this.getEvents();
      })
      .catch((error) => {
        this.utlityService.log(error);
        this.loaderService.dismiss();
        this.utlityService.createAlert('Alert', error,'OK');
      })
  }

  getSocietyRole() {
    this.societyRoleService.getSocietyRoles()
      .then((result) => {
        this.loaderService.dismiss();
        this.roles = result;
        this.utlityService.log(this.roles);
      })
      .catch((error) => {
        this.loaderService.dismiss();
        (error);
      })
  }

  getEvents() {
    this.utlityService.log("GetEvent function called");
    this.eventsService.getEventsDetailsFromURL();
  }

  async OtpBox() {
    const modal = await this.modalController.create({
      component: OtpPopUpComponent,
      backdropDismiss: false,
    });

    modal.present();
    await modal.onWillDismiss();
  }

  GetData(data)
  {
    this.utlityService.log(data);
    this.data.FirstName=data.FirstName;
    this.data.LastName=data.LastName;
    this.data.EmailId=data.EmailId;
    this.data.MobileNo=data.MobileNo;
    this.data.Pincode=data.Pincode;

  }

  async Register() {

    this.registervalidate=true;
    this.utlityService.log("Regsiter");

    if (this.data.FirstName == "") {
      this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter the First Name.<p>', 'Close');
    }
    else if (this.data.LastName == "") {
      this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter the Last Name.</p>', 'Close');
    }
    else if (this.data.EmailId == "") {
      this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter the Email.</p>', 'Close');
    }
    else if (this.data.EmailId != "") {
      let x = this.data.EmailId;
      let atposition = x.indexOf("@");
      let dotposition = x.lastIndexOf(".");
      if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length) {
        this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter the Valid Email.</p>', 'Close');
      }
      else if (this.data.MobileNo == "") {
        this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter theMobile Number.</p>', 'Close');
      }
      else if (this.data.Pincode == "") {
        this.utlityService.createAlert('Alert', '<p class="alert-message">Please enter the Pin Code.</p>', 'Close');
      }
      else {
        this.utlityService.log("registered");
        this.registerService.registerVisitor(this.eventsService.getEventId(),this.data)
        .then((result)=>{
          this.utlityService.log(result);
          this.utlityService.createAlert('Congratulations!!!', '<p class="alert-message"><b>You are just a step away from visiting the Exhibition! Enter the One time Verification code (OTP) sent to your Email Id/Phone Number.</b> </p>', {text: "Ok",handler: () => {this.OtpBox();}});
        })
        .catch((error)=>{
          this.utlityService.log(error);
        })
        
      }
    }
  }
}
