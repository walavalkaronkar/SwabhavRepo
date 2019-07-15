import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class RegisterService
{
    url:string="";
    eventUrl:string="/visitors/event/";
    visitorDetails:any;
    constructor(public mainUrlSerice:MainUrlService,private http: HttpClient)
    {

    }
    registerVisitor(id,data):Promise<any>
    {

        this.url=this.mainUrlSerice.getURL();
        this.url+=this.eventUrl+id;
        console.log(this.url);

        return new Promise((resolve,reject)=>{
            this.http.post(this.url,data)
            .toPromise()
            .then((result)=>
            {
                this.visitorDetails=result;
                resolve(result);
            })
            .catch((error)=>{
                console.log(error);
                reject(error);
            })
        })
    }

    getVisitorID()
    {
        return this.visitorDetails.id;
    }
}