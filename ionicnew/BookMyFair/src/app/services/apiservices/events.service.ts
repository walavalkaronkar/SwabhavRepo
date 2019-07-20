import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { UtilityService } from '../utility.service';
import { StorageService } from '../storage.service';
import { ConstantService } from '../constant.service';

@Injectable()
export class EventsService {
    url: string = "";

    eventDetails: any = null;
    constructor(public http: HttpClient, private UtilityService: UtilityService,
        private storageSerice: StorageService, private constantService: ConstantService) {

    }

    getEventsDetailsFromURL(): Promise<any> 
    {
        let eventsUrl: string = "/event/activeEvent";
        this.url = this.constantService.getURL() + eventsUrl;
        this.UtilityService.log("Getting Events From url" + this.url);
        return new Promise((resolve, reject) => {
        this.http.get(this.url, { responseType: 'json' })
            .toPromise()
            .then((result) => {

                this.eventDetails = result;
                this.storeEventsDetails();
                (this.getEventId());
                resolve(result);
            })
            .catch((error) => {
                this.UtilityService.log(error);
                reject(error);
            })
        });
    }

    getEventsDetails() {
        return this.eventDetails;
    }

    storeEventsDetails() {
        if (this.storageSerice.getEventsDetails() === null) {
            this.storageSerice.setEventsDetails(this.eventDetails);
        }
        else {
            this.storageSerice.setEventsDetails(this.eventDetails);
        }
    }


    getEventId() {
        return this.eventDetails.id;
    }


    getBanners(): Promise<any> {
        let bannerUrl: string = "/event/exhibitionList";
        let url = this.constantService.getURL() + bannerUrl;
        return new Promise((resolve, reject) => {
            this.http.get(url, { responseType: 'json' })
                .toPromise()
                .then((result) => {

                    this.UtilityService.log(result);
                   resolve(result);

                })
                .catch((error) => {
                    this.UtilityService.log(error);
                    reject(error);
                })
        });
    }
}