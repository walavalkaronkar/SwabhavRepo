import { Component } from "@angular/core";
import { ProductService } from '../service/product.service';

@Component
({
    selector:"productlist",
    templateUrl:"./productList.component.html"
})

export class ProductListComponent{
    products:any=[];
    DisplayText:string="Show";
    show:boolean=true;
    constructor(private productservice:ProductService)
    {
        this.getProducts();

    }

    getProducts()
    {
        this.productservice.getProducts()
            .then((r)=>{
            this.products=r;
            console.log(this.products);
            })
            .catch((err)=>
            {
            console.log(err);
            })
    }

    showhideImage()
    {
        if(this.show)
        {
            this.show=false;
            this.DisplayText="Hide";
        }
        else
        {
            this.show=true;
            this.DisplayText="Show";
        }

    }
}