import { Component } from "@angular/core";


@Component
({
    selector:"star-rating",
    templateUrl:"./star.component.html"
})

export class StarComponent
{
    constructor()
    {
        console.log("star component")
    }
}