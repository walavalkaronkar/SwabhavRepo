import {Component} from '@angular/core';

@Component
({
    selector: 'aboutus',
    templateUrl: './aboutus.component.html',
})

export class AboutUsComponent
{
    message:string;
    constructor()
    {
        this.message="AboutUs";
    }
}