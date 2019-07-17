import { Component } from '@angular/core';

import { Platform, LoadingController } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';
import { OrganizerIdService } from './services/apiservices/organizerId.service';
import { Router } from '@angular/router';
import { StorageService } from './services/apiservices/storage.service';





@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
})


export class AppComponent {
  isLoading:boolean;
  showMenu:boolean=true;
  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar,
    private router: Router,
    storageSerice:StorageService
  ) 
  {
    this.initializeApp();
    if(!storageSerice.getVisitorDetails())
    {
      this.router.navigate(['/register']);
      return;
    }
    this.router.navigate(['/home']);
  }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }
}
