import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { UtilityService } from './utility.service';
import { StorageService } from './storage.service';
import { ConstantService } from './constant.service';
import { Router } from '@angular/router';


@Injectable()
export class VisitorService {
    url: string = "";
    visitorId: string = "";
    otp: any = "";
    data = { Action: "Send", Code: "", ReferralCode: "" }
    eventUrl: string = "/visitors/event/";
    visitorDetails: any;
    constructor(public mainUrlSerice: MainUrlService, private http: HttpClient, private UtilityService: UtilityService,
        private storageService: StorageService, private constantservice: ConstantService,private router:Router,
        private mainUrl: MainUrlService) {

    }

    //Register Related Methods
    registerVisitor(id, data): Promise<any> {

        let url = this.mainUrlSerice.getURL();
        this.UtilityService.log("Main url from register service"+url);
        url += this.eventUrl + id;
        this.UtilityService.log("Main url from register service"+url);

        return new Promise((resolve, reject) => {
            this.http.post(url, data)
                .toPromise()
                .then((result) => {
                    this.visitorDetails = result;
                    resolve(result);
                })
                .catch((error) => {
                    this.UtilityService.log(error);
                    reject(error);
                })
        })
    }

    storeVisitorsDetails() {
        this.storageService.setVisitorDetails(this.visitorDetails);
    }
    getVisitorID() {
        return this.visitorDetails.id;
    }



    //Otp related methods


    sendOTP(id)//:Promise<any>
    {
        this.visitorId = this.getVisitorID();
        this.visitorId = id;
        let url = this.mainUrl.getURL() + "/visitors/" + this.visitorId + "/Activation";

        return new Promise((resolve, reject) => {
            this.http.post(url, this.data)
                .toPromise()
                .then((result) => {
                    this.UtilityService.log(result);
                    this.otp = result;
                })
                .catch((error) => {
                    this.UtilityService.log(error);
                })
        })
    }

    verifyOTP(otp) {
        this.data.Code = otp;
        this.data.Action = "Verify";
        let url = this.mainUrl.getURL() + "/visitors/" + this.visitorId + "/Activation";

        return new Promise((resolve, reject) => {
            this.http.post(url, this.data)
                .toPromise()
                .then((result) => {
                    this.UtilityService.log(result);
                    resolve(result);
                    this.storeVisitorsDetails();
                    this.login();

                })
                .catch((error) => {
                    this.UtilityService.log(error);
                    reject(error);
                })
        })

    }

    compareOTP(otp) {
        if (this.otp == otp) {
            return true;
        }
        else {
            return false;
        }
    }


    //login related methods
    login() {
        let url = this.mainUrlSerice.getURL();
        let visitorDetails = this.storageService.getVisitorDetails();
        url = url + "/Login/visitorLogin/visitor/" + visitorDetails.id;
        this.UtilityService.log(url);


        this.http.post(url, '')
            .toPromise()
            .then((result) => {
                visitorDetails = result;
                this.router.navigate(['home']);


            })
            .catch((error) => {
                this.UtilityService.log(error);

            });

    }
}