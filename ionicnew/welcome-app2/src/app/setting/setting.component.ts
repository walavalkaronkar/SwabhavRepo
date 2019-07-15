import { Component, OnInit, Input } from '@angular/core';
import { ModalController } from '@ionic/angular';

@Component({
  selector: 'app-setting',
  templateUrl: './setting.component.html',
  
})
export class SettingComponent implements OnInit {
  website: string;
  otp:string="";
  constructor(private modalController: ModalController) { }

  ngOnInit() {
  }

  settingIonic(version: string) {
    this.modalController.dismiss({
      'ionic': version
    });
  }


  cancel() { this.modalController.dismiss(); }

}