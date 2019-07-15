import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { SettingComponent } from '../setting/setting.component';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {
  dataFromModal;

  constructor(private modalController: ModalController) {}

  ngOnInit() { }

  async settings() {
    const modal = await this.modalController.create({
      component: SettingComponent,
      backdropDismiss: false,
    });

    modal.present();
    await modal.onWillDismiss();
  }
}
