import { Component } from "@angular/core";

@Component
({
    selector:"welcome",
    templateUrl:"./welcome.component.html"
})

export class WelcomeComponent{
    products:any;
    constructor()
    {
        console.log("welcome constructor");
    }

   
}