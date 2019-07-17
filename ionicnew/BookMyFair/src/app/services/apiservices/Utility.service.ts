import { Injectable } from "@angular/core";
import { ToastController, AlertController } from '@ionic/angular';
import { Keyboard } from '@ionic-native/keyboard/ngx';


@Injectable()
export class UtlityService {
    constructor(private toastController: ToastController,private keyboard: Keyboard,private alertController:AlertController) {
    }

    log(message) {
        console.log(message);
    }

    async shortToastMessage(message) {
        const toast = await this.toastController.create({
            message: message,
            duration: 1000
        });
        toast.present();
    }
    
    async longToastMessage(message)
    {
        const toast=await this.toastController.create({
            message:message,
            duration:2000
        });
    }

    hideKeyBoard()
    {
        this.keyboard.hide();
    }

    async createAlert(heading, viewMessage, button) {
        const alert = await this.alertController.create({
          header: heading,
          message: viewMessage,
          buttons: [button]
        });
        await alert.present();
      }
}