import { Component } from '@angular/core';
import { NavController, AlertController, ModalController, LoadingController } from '@ionic/angular';
import { OtpPopUpComponent } from '../otpPopUp/otpPopUp.component';
import { MainService } from 'src/app/services/apiservices/main.service';

import { VisitorService } from 'src/app/services/apiservices/visitor.service';
import { EventsService } from 'src/app/services/apiservices/events.service';
import { UtilityService } from 'src/app/services/apiservices/utility.service';
import { StorageService } from 'src/app/services/apiservices/storage.service';
import { LoaderService } from 'src/app/services/apiservices/loader.service';
import { ConstantService } from 'src/app/services/apiservices/constant.service';

@Component({
  selector: 'register',
  templateUrl: 'register.page.html',
  styleUrls: ['register.page.scss'],
})
export class RegisterComponent {
  registervalidate = false;
  termsCondition: boolean = false;
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
    public organizeIDService: MainService, public loadingController: LoadingController, public mainService: MainService,
    public visitorService: VisitorService, public eventsService: EventsService, private UtilityService: UtilityService,
    private storageSerice: StorageService, private loaderService: LoaderService, private constantService: ConstantService) {

    if (this.storageSerice.getOrganizersDetails() === null) {
      this.loaderService.Loader();
      this.UtilityService.log("No Organizer ID");
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
        this.UtilityService.log(r);
        this.getSocietyRole();
        this.getEvents();
      })
      .catch((error) => {
        this.UtilityService.log(error);
        this.loaderService.dismiss();
        this.UtilityService.createAlert('Alert', error, 'OK');
      })
  }

  getSocietyRole() {
    this.mainService.getSocietyRoles()
      .then((result) => {
        this.loaderService.dismiss();
        this.roles = result;
        this.UtilityService.log(this.roles);
      })
      .catch((error) => {
        this.loaderService.dismiss();
        (error);
      })
  }

  getEvents() {
    this.UtilityService.log("GetEvent function called");
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

  GetData(data) {
    this.UtilityService.log(data);
    this.data.FirstName = data.FirstName;
    this.data.LastName = data.LastName;
    this.data.EmailId = data.EmailId;
    this.data.MobileNo = data.MobileNo;
    this.data.Pincode = data.Pincode;

  }

  async Register() {

    this.registervalidate = true;
    if (this.data.EmailId != "") {
      let x = this.data.EmailId;
      let atposition = x.indexOf("@");
      let dotposition = x.lastIndexOf(".");
      if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length) {
        this.UtilityService.createAlert('Alert', '<p class="alert-message">Please enter the Valid Email.</p>', 'Close');
        return;
      }
      if (this.data.FirstName != "" && this.data.LastName != "" && this.data.EmailId != "" && this.data.MobileNo != ""
        && this.data.Pincode != "" && this.termsCondition == true) {
        this.UtilityService.log("registered");
        this.visitorService.registerVisitor(this.eventsService.getEventId(), this.data)
          .then((result) => {
            this.UtilityService.log(result);
            this.UtilityService.createAlert('Congratulations!!!', '<p class="alert-message"><b>You are just a step away from visiting the Exhibition! Enter the One time Verification code (OTP) sent to your Email Id/Phone Number.</b> </p>', { text: "Ok", handler: () => { this.OtpBox(); } });
          })
          .catch((error) => {
            this.UtilityService.log(error);
          })
      }
    }

  }

  toggleTermsAndCondition(event) {
    if (event.target.checked) {
      this.termsCondition = true;
    }
    else {
      this.termsCondition = false;
    }
  }
}
