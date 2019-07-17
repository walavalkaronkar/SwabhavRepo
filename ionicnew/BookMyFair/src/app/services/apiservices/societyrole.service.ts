import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { OrganizerIdService } from './organizerId.service';
import { UtlityService } from './Utility.service';

@Injectable()
export class SocietyRoleService
{
    url:string="";
    societyUrl:string="/general/SocietyRole";
    result:any;
    constructor(public mainUrlService:MainUrlService, public http:HttpClient,private UtlityService:UtlityService)
    {
        
    }

    getSocietyRoles():Promise<any>
    {
        this.url=this.mainUrlService.getURL();
        this.url+=this.societyUrl;
        return new Promise((resolve, reject) => {
            this.http.get(this.url, { responseType: 'json' })
                .toPromise()
                .then((response) => {
                    this.result = response;
                    resolve(this.convertJSONRoleToArray());
                })
                .catch((error) => {
                    this.UtlityService.log(error);
                    reject(error.message);
                })
        });
    }

    convertJSONRoleToArray()
    {
        let roles=[];
        for(let index=0;index<this.result.length;index++)
        {
            roles.push(this.result[index].value);
        }
        return roles;
    }
}