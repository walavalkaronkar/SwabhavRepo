import { Component, OnInit, Input } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { OTPService } from 'src/app/services/apiservices/otp.service';

@Component({
  selector: 'app-setting',
  templateUrl: './otpPopUp.component.html',
  styleUrls: ['otpPopUp.scss']
  
})
export class OtpPopUpComponent implements OnInit {
  website: string;
  otp:string="";
  invalid:boolean=false;
  constructor(private modalController: ModalController,public otpService:OTPService) { }

  ngOnInit() {
    console.log("called");
    this.otpService.sendOTP("b8c4fdee-938e-416f-ad4a-9fccdd320fc8");


  }

  Resend()
  {
    this.otpService.sendOTP("b8c4fdee-938e-416f-ad4a-9fccdd320fc8");
  }

  Verify()
  {
    this.invalid=!(this.otpService.compareOTP(this.otp));
    console.log(this.invalid)
    if(this.invalid==false)
    {
      this.otpService.verifyOTP(this.otp);
    }
  }

  settingIonic(version: string) {
    this.modalController.dismiss({
      'ionic': version
    });
  }


  cancel() { this.modalController.dismiss(); }

}