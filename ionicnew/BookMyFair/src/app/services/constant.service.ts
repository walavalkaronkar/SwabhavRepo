import { Injectable } from "@angular/core";

@Injectable()
export class ConstantService{
    Organizer_Details:string="OrganizerDetails";
    Visitors_Details:string="visitorsDetails";
    Events_Details:string="eventsDetails";


    //main url
    url:string="http://gsmktg.azurewebsites.net:80/api/v1/organizers";
    
    getURL()
    {
        return this.url;
    }
    setURL(url)
    {
        this.url=url;
    }

}