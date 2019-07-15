import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class OrganizerIdService {
    url: string = "";
    organizerId: string = "";
    result: any;
    constructor(private http: HttpClient, public mainUrlService: MainUrlService) {
        this.url = mainUrlService.getURL();
    }

    

    getURLWithOrganizerID() {
        return this.url;
    }

    updateURL() {
        this.url = this.url + "/" + this.organizerId;
        this.mainUrlService.setURL(this.url);
        console.log(this.mainUrlService.getURL())
    }
    getOrganizerIdFromUrl(): Promise<string> {
        return new Promise((resolve, reject) => {
            this.http.get(this.url, { responseType: 'json' })
                .toPromise()
                .then((response) => {
                    this.result = response;
                    this.organizerId = this.result[0].id;
                    //console.log(this.organizerId);
                    this.updateURL();
                    this.storeOrganizerDetails();
                    resolve("Success");
                })
                .catch((error) => {
                    console.log(error);
                    reject(error.message);
                })
        });
    }

    getOrganizerDetailsFromStorage() {
        this.result = JSON.parse(localStorage.getItem("OrganizerId"));
        this.organizerId = this.result[0].id;
        //console.log(this.organizerId);
        this.updateURL();

    }

    storeOrganizerDetails() {
        //console.log("store organizer details called");
        //console.log(this.result)
        localStorage.setItem("OrganizerId", JSON.stringify(this.result));
    }


}