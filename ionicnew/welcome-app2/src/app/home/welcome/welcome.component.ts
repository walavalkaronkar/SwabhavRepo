import { Component } from "@angular/core";

@Component(
{
    selector:'welcome',
    templateUrl:'./welcome.component.html',
})

export class WelcomeComponent{
    title:string="data from welcome component";
    constructor()
    {
        console.log(this.title);
    }
    onClick()
    {
        alert("clicked")
    }
}