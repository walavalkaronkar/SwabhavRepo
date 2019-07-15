import { Component, Input } from "@angular/core";


@Component
({
    selector:"star-rating",
    templateUrl:"./star.component.html"
})

export class StarComponent
{
    @Input()
    rating:number;
    
    constructor()
    {
        console.log("star component")
    }
}