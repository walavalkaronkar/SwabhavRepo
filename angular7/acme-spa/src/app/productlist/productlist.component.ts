import { Component } from "@angular/core";
import { ProductService } from '../service/product.service';

@Component
({
    selector:"productlist",
    templateUrl:"./productList.component.html"
})

export class ProductListComponent{
    products:any=[];
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
}