import { Injectable } from '@angular/core';
import { OrganizerIdService } from './organizerId.service';
import { HttpClient } from '@angular/common/http';
import { MainUrlService } from './mainurl.service';

@Injectable()
export class EventsService
{
    url:string="";
    eventsUrl:string="/event/activeEvent";
    eventDetails:any=null;
    constructor(public mainUrlservice:MainUrlService,public http:HttpClient)
    {

    }

    getEventsDetailsFromURL()
    {
        this.url=this.mainUrlservice.getURL()+this.eventsUrl;
        console.log("Getting Events From url",this.url);
        this.http.get(this.url,{responseType: 'json'})
        .toPromise()
        .then((result)=>{
           
            this.eventDetails=result;
            this.storeEventsDetails();
            console.log(this.getEventId());
        })
        .catch((error)=>{
            console.log(error);
        })
    }

    getEventsDetails()
    {
        return this.eventDetails;
    }

    storeEventsDetails()
    {
        if (sessionStorage.getItem("eventsDetails") === null) {
            sessionStorage.setItem('eventsDetails',JSON.stringify(this.eventDetails));
        }
        else
        {
            sessionStorage.setItem('eventsDetails',JSON.stringify(this.eventDetails));
        }
    }


    getEventId()
    {
        return this.eventDetails.id;
    }
}