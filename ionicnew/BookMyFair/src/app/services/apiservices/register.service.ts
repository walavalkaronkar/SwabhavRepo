import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { UtlityService } from './Utility.service';
import { StorageService } from './storage.service';
import { ConstantService } from './constant.service';


@Injectable()
export class RegisterService
{
    url:string="";
    eventUrl:string="/visitors/event/";
    visitorDetails:any;
    constructor(public mainUrlSerice:MainUrlService,private http: HttpClient,private UtlityService:UtlityService,
        private storageService:StorageService,private constantservice:ConstantService)
    {

    }
    registerVisitor(id,data):Promise<any>
    {

        this.url=this.mainUrlSerice.getURL();
        this.url+=this.eventUrl+id;
        (this.url);

        return new Promise((resolve,reject)=>{
            this.http.post(this.url,data)
            .toPromise()
            .then((result)=>
            {
                this.visitorDetails=result;
                resolve(result);
            })
            .catch((error)=>{
                this.UtlityService.log(error);
                reject(error);
            })
        })
    }

    storeVisitorsDetails()
    {
        this.storageService.setVisitorDetails(this.visitorDetails);
    }
    getVisitorID()
    {
        return this.visitorDetails.id;
    }
}