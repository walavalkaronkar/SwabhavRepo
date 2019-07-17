import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { StorageService } from './storage.service';
import { UtlityService } from './Utility.service';
import { ConstantService } from './constant.service';

@Injectable()
export class OrganizerIdService {
    url: string = "";
    organizerId: string = "";
    result: any;
    constructor(private http: HttpClient, public mainUrlService: MainUrlService,private storageSerice:StorageService,
        private UtlityService:UtlityService,private constantservice:ConstantService) {
        this.url = mainUrlService.getURL();
    }


    getURLWithOrganizerID() {
        return this.url;
    }

    updateURL() {
        this.url = this.url + "/" + this.organizerId;
        this.mainUrlService.setURL(this.url);
        (this.mainUrlService.getURL())
    }
    
    getOrganizerIdFromUrl(): Promise<string> {
        return new Promise((resolve, reject) => {
            this.http.get(this.url, { responseType: 'json' })
                .toPromise()
                .then((response) => {
                    this.result = response;
                    this.organizerId = this.result[0].id;
                    //(this.organizerId);
                    this.updateURL();
                    this.storeOrganizerDetails();
                    resolve("Success");
                })
                .catch((error) => {
                    (error);
                    reject(error.message);
                })
        });
    }

    getOrganizerDetailsFromStorage() {
        this.result=this.storageSerice.getOrganizersDetails();
        this.UtlityService.log(this.result);  
        this.organizerId = this.result[0].id;
        this.updateURL();

    }

    storeOrganizerDetails() {
        this.storageSerice.setOrganizerDetails(this.result);
    }


}