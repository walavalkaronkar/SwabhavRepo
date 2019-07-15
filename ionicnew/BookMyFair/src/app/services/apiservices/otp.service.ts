import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { RegisterService } from './register.service';

@Injectable()
export class OTPService
{
    url:string="";
    visitorId:string="";
    otp:any="226485";
    data = { Action: "Send", Code: "", ReferralCode: "" }
    constructor(public mainUrl:MainUrlService,public http:HttpClient,public registerService:RegisterService)
    {

    }


    sendOTP(id)//:Promise<any>
    {   
        this.visitorId=this.registerService.getVisitorID();
        this.visitorId=id;
        this.url=this.mainUrl.getURL()+"/visitors/"+this.visitorId+"/Activation";
        
        return new Promise((resolve,reject)=>{
            this.http.post(this.url,this.data)
            .toPromise()
            .then((result)=>
            {
                console.log(result);
                this.otp=result;
            })
            .catch((error)=>
            {
                console.log(error);
            })
        })
    }

    verifyOTP(otp)
    {
        this.data.Code=otp;
        this.data.Action="Verify";
        console.log(this.data);
        
        return new Promise((resolve,reject)=>{
            this.http.post(this.url,this.data)
            .toPromise()
            .then((result)=>
            {
                console.log(result);
                resolve(result);
            })
            .catch((error)=>
            {
                console.log(error);
                reject(error);
            })
        })
        
    }

    compareOTP(otp)
    {
        if(this.otp==otp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}