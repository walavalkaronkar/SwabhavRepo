
import {Component, Input} from '@angular/core';

@Component
({
    selector: 'btn-rating',
    templateUrl: './btnrating.component.html',
})

export class ButtonRating
{

    @Input()
    rating:string;
    
    constructor()
    {
       
    }
}