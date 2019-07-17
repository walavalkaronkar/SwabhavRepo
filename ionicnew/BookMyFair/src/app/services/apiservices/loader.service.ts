import { Injectable } from "@angular/core";
import { LoadingController } from '@ionic/angular';
import { UtlityService } from './Utility.service';

@Injectable()
export class LoaderService
{
    isLoading:boolean=true;
    constructor(private loadingController:LoadingController,private UtlityService:UtlityService)
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
              a.dismiss().then(() =>this.UtlityService.log('abort presenting'));
            }
          });
        });
      }
      
      async dismiss() {
        this.isLoading = false;
        return await this.loadingController.dismiss().then(() => this.UtlityService.log('dismissed'));
      }
}