import { Component } from "@angular/core";
import { StorageService } from 'src/app/services/apiservices/storage.service';
import { UtlityService } from 'src/app/services/apiservices/Utility.service';
import { MenuController } from '@ionic/angular';

@Component({
    selector: 'home',
    templateUrl: './home.component.html'
})

export class HomeComponent {
    eventsDetails:any;
    constructor(private storageService:StorageService,private utiltyService:UtlityService,private menu: MenuController) {
        this.eventsDetails=storageService.getEventsDetails();
        utiltyService.log(this.eventsDetails);
    }

}