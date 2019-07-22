import { Component } from "@angular/core";
import { TicketsService } from 'src/app/services/apiservices/tickets.service';

@Component({
    selector:"show-ticket",
    templateUrl:"./showtickets.component.html"
})

export class ShowTicketsComponent
{
    constructor(private ticketService:TicketsService)
    {
        ticketService.showEventsTickets();
    }
}