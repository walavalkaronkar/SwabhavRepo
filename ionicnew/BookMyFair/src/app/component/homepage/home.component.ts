import { Component } from "@angular/core";
import { StorageService } from 'src/app/services/apiservices/storage.service';
import { UtilityService } from 'src/app/services/apiservices/utility.service';
import { MenuController } from '@ionic/angular';

@Component({
    selector: 'home',
    templateUrl: './home.component.html'
})

export class HomeComponent {
    eventsDetails:any;
    constructor(private storageService:StorageService,private utiltyService:UtilityService,private menu: MenuController) {
        this.eventsDetails=storageService.getEventsDetails();
        utiltyService.log(this.eventsDetails);
    }

}