import { Injectable } from '@angular/core';
import { MainService } from './main.service';
import { HttpClient } from '@angular/common/http';
import { MainUrlService } from './mainurl.service';
import { UtilityService } from './utility.service';
import { StorageService } from './storage.service';
import { ConstantService } from './constant.service';

@Injectable()
export class EventsService
{
    url:string="";
    eventsUrl:string="/event/activeEvent";
    eventDetails:any=null;
    constructor(public mainUrlservice:MainUrlService,public http:HttpClient,private UtilityService:UtilityService,
        private storageSerice:StorageService,private constantservice:ConstantService)
    {

    }

    getEventsDetailsFromURL()
    {
        this.url=this.mainUrlservice.getURL()+this.eventsUrl;
        this.UtilityService.log("Getting Events From url"+this.url);
        this.http.get(this.url,{responseType: 'json'})
        .toPromise()
        .then((result)=>{
           
            this.eventDetails=result;
            this.storeEventsDetails();
            (this.getEventId());
        })
        .catch((error)=>{
            this.UtilityService.log(error);
        })
    }

    getEventsDetails()
    {
        return this.eventDetails;
    }

    storeEventsDetails()
    {
        if (this.storageSerice.getEventsDetails() === null) {
            this.storageSerice.setEventsDetails(this.eventDetails);
        }
        else
        {
            this.storageSerice.setEventsDetails(this.eventDetails);
        }
    }


    getEventId()
    {
        return this.eventDetails.id;
    }
}