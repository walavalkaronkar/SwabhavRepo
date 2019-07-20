import { Component, OnInit, Input } from '@angular/core';
import { ModalController, LoadingController } from '@ionic/angular';
import { VisitorService } from 'src/app/services/apiservices/visitor.service';
import { UtilityService } from 'src/app/services/utility.service';

@Component({
  selector: 'otp',
  templateUrl: './otpPopUp.component.html',
  styleUrls: ['otpPopUp.scss']
  
})
export class OtpPopUpComponent implements OnInit {
  website: string;
  otp:string="";
  invalid:boolean=false;
  isLoading:boolean=false;
  constructor(private modalController: ModalController,public visitorService:VisitorService,private UtilityService:UtilityService,
    public loadingController:LoadingController) 
  { }

  ngOnInit() {
    this.UtilityService.log("called");
    this.visitorService.sendOTP(this.visitorService.getVisitorID());


  }

  Resend()
  {
    this.visitorService.sendOTP(this.visitorService.getVisitorID());
  }

  Verify()
  {
    
    this.invalid=!(this.visitorService.compareOTP(this.otp));
    (this.invalid)
    if(this.invalid==false)
    {

      this.visitorService.verifyOTP(this.otp);
      this.cancel();
    }
  }

  settingIonic(version: string) {
    this.modalController.dismiss({
      'ionic': version
    });
  }


  cancel() { this.modalController.dismiss(); }
}