import { Injectable } from "@angular/core";
import { ToastController, AlertController, LoadingController } from '@ionic/angular';
import { Keyboard } from '@ionic-native/keyboard/ngx';


@Injectable()
export class UtilityService {
    isLoading:boolean=false;
    constructor(private toastController: ToastController, private keyboard: Keyboard, private alertController: AlertController,
        private loadingController:LoadingController) {
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

    async longToastMessage(message) {
        const toast = await this.toastController.create({
            message: message,
            duration: 2000
        });
    }

    hideKeyBoard() {
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


    //Loader

    async Loader() {
        this.isLoading = true;
        return await this.loadingController.create({
          duration: 20000,
          message: 'Please wait...',
          spinner: 'crescent',
        }).then(a => {
          a.present().then(() => {
            ('loader started');
            if (!this.isLoading) {
              a.dismiss().then(() =>this.log('abort loader'));
            }
          });
        });
      }
      
      async dismiss() {
        this.isLoading = false;
        return await this.loadingController.dismiss().then(() => this.log('loader cancelled'));
      }
}