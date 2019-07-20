import { Injectable } from "@angular/core";

import { HttpClient } from '@angular/common/http';
import { StorageService } from '../storage.service';
import { UtilityService } from '../utility.service';
import { ConstantService } from '../constant.service';

@Injectable()
export class MainService {
    url: string = "";
    societyUrl:string="/general/SocietyRole";
    societyRole:any;
    organizerId: string = "";
    result: any;
    constructor(private http: HttpClient,private storageSerice:StorageService, private UtilityService:UtilityService,
        private constantservice:ConstantService) {
        this.url = constantservice.getURL();
    }


    getURLWithOrganizerID() {
        return this.url;
    }

    updateURL() {
        this.url = this.url + "/" + this.organizerId;
        this.constantservice.setURL(this.url);
        (this.constantservice.getURL())
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
        this.UtilityService.log(this.result);  
        this.organizerId = this.result[0].id;
        this.updateURL();

    }

    storeOrganizerDetails() {
        this.storageSerice.setOrganizerDetails(this.result);
    }



    getSocietyRoles():Promise<any>
    {
        this.url=this.constantservice.getURL();
        this.url+=this.societyUrl;
        return new Promise((resolve, reject) => {
            this.http.get(this.url, { responseType: 'json' })
                .toPromise()
                .then((response) => {
                    this.societyRole = response;
                    resolve(this.convertJSONRoleToArray());
                })
                .catch((error) => {
                    this.UtilityService.log(error);
                    reject(error.message);
                })
        });
    }

    convertJSONRoleToArray()
    {
        let roles=[];
        for(let index=0;index<this.societyRole.length;index++)
        {
            roles.push(this.societyRole[index].value);
        }
        return roles;
    }

}