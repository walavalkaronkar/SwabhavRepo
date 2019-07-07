import { Component } from '@angular/core';
import { ActivatedRoute } from "@angular/router";

@Component
    ({
        selector: 'career',
        templateUrl: './career.component.html',
    })

export class CareerComponent {
    message: string;
    id: string;
    constructor(private route: ActivatedRoute) {
        this.message = "Carrer";
         this.route.paramMap.subscribe(p=>{this.id=p.get('id')})
        console.log(this.id);
    }

}