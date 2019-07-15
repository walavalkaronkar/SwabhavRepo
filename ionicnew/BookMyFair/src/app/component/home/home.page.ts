import { Component } from '@angular/core';
import { NavController, AlertController, ModalController, LoadingController } from '@ionic/angular';
import { OtpPopUpComponent } from '../setting/otpPopUp.component';
import { OrganizerIdService } from 'src/app/services/apiservices/organizerId.service';
import { SocietyRoleService } from 'src/app/services/apiservices/societyrole.service';
import { RegisterService } from 'src/app/services/apiservices/register.service';
import { EventsService } from 'src/app/services/apiservices/events.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
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
    public registerService: RegisterService, public eventsService: EventsService) {

    if (localStorage.getItem("OrganizerId") === null) {
      this.Loader();
      console.log("No Organizer ID");
      this.getOrganizerID();
    }
    else {
      this.Loader();
      organizeIDService.getOrganizerDetailsFromStorage();
      this.getSocietyRole();
      this.getEvents();
    }
  }

  getOrganizerID() {
    this.organizeIDService.getOrganizerIdFromUrl()
      .then((r) => {
        console.log(r);
        this.getSocietyRole();
        this.getEvents();
      })
      .catch((error) => {
        console.log(error);
        this.dismiss();
        this.createAlert('Alert', error,'OK');
      })
  }

  getSocietyRole() {
    this.societyRoleService.getSocietyRoles()
      .then((result) => {
        this.dismiss();
        this.roles = result;
        console.log(this.roles);
      })
      .catch((error) => {
        this.dismiss();
        console.log(error);
      })
  }

  getEvents() {
    console.log("GetEvent function called");
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

  async Loader() {
    this.isLoading = true;
    return await this.loadingController.create({
      duration: 20000,
      message: 'Please wait...',
      spinner: 'crescent',
    }).then(a => {
      a.present().then(() => {
        console.log('presented');
        if (!this.isLoading) {
          a.dismiss().then(() => console.log('abort presenting'));
        }
      });
    });
  }

  async dismiss() {
    this.isLoading = false;
    return await this.loadingController.dismiss().then(() => console.log('dismissed'));
  }


  async createAlert(heading, viewMessage, button) {
    const alert = await this.alertCtrl.create({
      header: heading,
      message: viewMessage,
      buttons: [button]
    });

    await alert.present();
  }


  async Register() {
    console.log("Regsiter");
    if (this.data.FirstName == "") {
      this.createAlert('Alert', '<p class="alert-message">Please enter the First Name.<p>', 'Close');
    }
    else if (this.data.LastName == "") {
      this.createAlert('Alert', '<p class="alert-message">Please enter the Last Name.</p>', 'Close');
    }
    else if (this.data.EmailId == "") {
      this.createAlert('Alert', '<p class="alert-message">Please enter the Email.</p>', 'Close');
    }
    else if (this.data.EmailId != "") {
      let x = this.data.EmailId;
      let atposition = x.indexOf("@");
      let dotposition = x.lastIndexOf(".");
      if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length) {
        this.createAlert('Alert', '<p class="alert-message">Please enter the Valid Email.</p>', 'Close');
      }

      else if (this.data.MobileNo == "") {
        this.createAlert('Alert', '<p class="alert-message">Please enter theMobile Number.</p>', 'Close');
      }
      else if (this.data.Pincode == "") {
        this.createAlert('Alert', '<p class="alert-message">Please enter the Pin Code.</p>', 'Close');
      }
      else {
        console.log("registered");
        /*
        this.registerService.registerVisitor(this.eventsService.getEventId(),this.data)
        .then((result)=>{
          console.log(result);*/
          this.createAlert('Congralutions!!!', '<p class="alert-message"><b>You are just a step away from visiting the Exhibition! Enter the One time Verification code (OTP) sent to your Email Id/Phone Number.</b> </p>', {text: "Ok",handler: () => {this.OtpBox();}});
        /*})
        .catch((error)=>{
          console.log(error);
        })
        */
      }
    }
  }
}
