import { Injectable } from "@angular/core";
import { ConstantService } from './constant.service';

@Injectable()
export class StorageService {

    constructor(private constantService:ConstantService)
    {

    }

    private getfromLocal(name) {
        return JSON.parse(localStorage.getItem(name));
    }
    private setToLocal(name,data) {
        localStorage.setItem(name, JSON.stringify(data));
    }

    private getFromSession(name) {
        return JSON.parse(sessionStorage.getItem(name));
    }

    private setToSession(name,data) {
        sessionStorage.setItem(name, JSON.stringify(data));
    }

    //OrganizerDetails
    getOrganizersDetails()
    {
        return this.getFromSession(this.constantService.Organizer_Details);
    }

    setOrganizerDetails(data)
    {
        this.setToSession(this.constantService.Organizer_Details,data);
    }

    //EventsDetails
    getEventsDetails()
    {
        return this.getFromSession(this.constantService.Events_Details);
    }

    setEventsDetails(data)
    {
        this.setToSession(this.constantService.Events_Details,data)
    }

    //VisitorsDetails
    getVisitorDetails()
    {
        return this.getfromLocal(this.constantService.Visitors_Details);
    }

    setVisitorDetails(data)
    {
        this.setToLocal(this.constantService.Visitors_Details,data)
    }
}