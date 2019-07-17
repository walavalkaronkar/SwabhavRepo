import { Injectable } from "@angular/core";
import { MainUrlService } from './mainurl.service';
import { HttpClient } from '@angular/common/http';
import { RegisterService } from './register.service';
import { Router } from '@angular/router';
import { UtlityService } from './Utility.service';
import { StorageService } from './storage.service';
import { ConstantService } from './constant.service';

@Injectable()
export class LoginService {
    url: string = "";
    visitorDetails: any;
    constructor(public mainurlService: MainUrlService, public http: HttpClient, public registerService: RegisterService,
        private router:Router,private UtlityService:UtlityService,private storageSerice:StorageService,
        private constantService:ConstantService) {

    }

    login() {
        this.url = this.mainurlService.getURL();
        this.visitorDetails = this.storageSerice.getVisitorDetails();
        this.url = this.url + "/Login/visitorLogin/visitor/" + this.visitorDetails.id;
        this.UtlityService.log(this.url);


        this.http.post(this.url, '')
            .toPromise()
            .then((result) => {
                this.visitorDetails = result;
                this.router.navigate(['home']);


            })
            .catch((error) => {
                this.UtlityService.log(error);

            });

    }
}