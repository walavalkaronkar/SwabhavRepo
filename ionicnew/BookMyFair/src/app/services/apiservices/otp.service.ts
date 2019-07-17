import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { RegisterService } from './register.service';
import { LoginService } from './login.service';
import { UtlityService } from './Utility.service';

@Injectable()
export class OTPService
{
    url:string="";
    visitorId:string="";
    otp:any="226485";
    data = { Action: "Send", Code: "", ReferralCode: "" }
    constructor(public mainUrl:MainUrlService,public http:HttpClient,public registerService:RegisterService,
    private UtlityService:UtlityService,public loginservice:LoginService)
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
                this.UtlityService.log(result);
                this.otp=result;
            })
            .catch((error)=>
            {
                this.UtlityService.log(error);
            })
        })
    }

    verifyOTP(otp)
    {
        this.data.Code=otp;
        this.data.Action="Verify";
        (this.data);
        
        return new Promise((resolve,reject)=>{
            this.http.post(this.url,this.data)
            .toPromise()
            .then((result)=>
            {
                this.UtlityService.log(result);
                resolve(result);
                this.registerService.storeVisitorsDetails();
                this.loginservice.login();
                
            })
            .catch((error)=>
            {
                this.UtlityService.log(error);
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