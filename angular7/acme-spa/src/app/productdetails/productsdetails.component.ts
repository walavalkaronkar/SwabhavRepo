import { Component } from "@angular/core";
import { Router, ActivatedRoute } from '@angular/router';
import { ProductService } from '../service/product.service';

@Component
({
    selector:"productsdetails",
    templateUrl:"./productsdetails.component.html"
})

export class ProductsDetailsComponent{
    id:string;
    constructor(private router:Router,private route:ActivatedRoute,private productservice:ProductService)
    {
        this.route.paramMap.subscribe(p=>{this.id =p.get('id')});
        console.log(this.id);
    }
}