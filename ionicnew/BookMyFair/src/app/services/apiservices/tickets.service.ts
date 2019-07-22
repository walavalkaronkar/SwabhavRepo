import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { UtilityService } from '../utility.service';
import { StorageService } from '../storage.service';
import { ConstantService } from '../constant.service';

@Injectable()

export class TicketsService
{
    constructor(public http: HttpClient, private UtilityService: UtilityService,private storageSerice: StorageService,
     private constantService: ConstantService)
    {

    }

    showEventsTickets()
    {
        let ticketURL:string="/event/activeTicketing/10/1";
        console.log(this.constantService.getURL());
    }
}