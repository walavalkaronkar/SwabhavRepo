import { Component, OnInit, Input } from '@angular/core';
import { ModalController, LoadingController } from '@ionic/angular';
import { OTPService } from 'src/app/services/apiservices/otp.service';
import { RegisterService } from 'src/app/services/apiservices/register.service';
import { UtlityService } from 'src/app/services/apiservices/Utility.service';

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
  constructor(private modalController: ModalController,public otpService:OTPService,public registerService:RegisterService,
    private UtlityService:UtlityService,public loadingController:LoadingController) 
  { }

  ngOnInit() {
    this.UtlityService.log("called");
    this.otpService.sendOTP(this.registerService.getVisitorID());


  }

  Resend()
  {
    this.otpService.sendOTP(this.registerService.getVisitorID());
  }

  Verify()
  {
    
    this.invalid=!(this.otpService.compareOTP(this.otp));
    (this.invalid)
    if(this.invalid==false)
    {

      this.otpService.verifyOTP(this.otp);
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