import { Component } from '@angular/core';

import { Platform, LoadingController, MenuController } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';
import { MainService } from './services/apiservices/main.service';
import { Router } from '@angular/router';
import { StorageService } from './services/storage.service';
import { UtilityService } from './services/utility.service';
import { EventsService } from './services/apiservices/events.service';





@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
})


export class AppComponent {
  isLoading: boolean;
  showMenu: boolean = true;
  displayMenu:boolean=false;
  visitorsDetails;
  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar,
    private router: Router,
    private storageService: StorageService,
    private utilityService: UtilityService,
    private mainService: MainService,
    private eventsService: EventsService,
    private menu:MenuController
  ) {
    this.initializeApp();
    
  }

  ngOnInit(): void {
    if (this.storageService.getOrganizersDetails() === null) {
      this.utilityService.Loader();
      this.utilityService.log("No Organizer ID");
      this.getOrganizerID();
    }
    else {
      this.utilityService.Loader();
      this.mainService.getOrganizerDetailsFromStorage();
      this.getEvents();
    }


  }

  getOrganizerID() {

    this.mainService.getOrganizerIdFromUrl()
      .then((r) => {
        this.utilityService.log("organiser id Data"+r);
        this.getEvents();
      })
      .catch((error) => {
        this.utilityService.log(error);
        this.utilityService.dismiss();
        this.utilityService.createAlert('Alert', error, 'OK');
      })
  }


  getEvents() {
    this.utilityService.log("GetEvent function called");
    this.eventsService.getEventsDetailsFromURL()
    .then(result=>{
      if (!this.storageService.getVisitorDetails()) {
        this.router.navigate(['/register']);
        return;
      }
      this.router.navigate(['/home']);
      this.getMenusDetails();
      this.utilityService.dismiss();
    
    })
    .catch(error=>{
      console.log(error);
      this.utilityService.dismiss();
    })
  }

  getMenusDetails()
  {
    this.visitorsDetails=this.storageService.getVisitorDetails();
    this.displayMenu=true;
  }

  profile()
  {
    this.router.navigate(['/profile']);
    this.menu.close();
  }


initializeApp() {
  this.platform.ready().then(() => {
    this.statusBar.styleDefault();
    this.splashScreen.hide();
  });
}
}
