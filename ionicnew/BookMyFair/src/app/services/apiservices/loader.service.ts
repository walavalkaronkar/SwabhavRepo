import { Injectable } from "@angular/core";
import { LoadingController } from '@ionic/angular';
import { UtilityService } from './utility.service';

@Injectable()
export class LoaderService
{
    isLoading:boolean=true;
    constructor(private loadingController:LoadingController,private UtilityService:UtilityService)
    {
        
    }
    async Loader() {
        this.isLoading = true;
        return await this.loadingController.create({
          duration: 20000,
          message: 'Please wait...',
          spinner: 'crescent',
        }).then(a => {
          a.present().then(() => {
            ('presented');
            if (!this.isLoading) {
              a.dismiss().then(() =>this.UtilityService.log('abort presenting'));
            }
          });
        });
      }
      
      async dismiss() {
        this.isLoading = false;
        return await this.loadingController.dismiss().then(() => this.UtilityService.log('dismissed'));
      }
}