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
    products:any=[];
    product:any={};
    constructor(private router:Router,private route:ActivatedRoute,private productservice:ProductService)
    {
        this.route.paramMap.subscribe(p=>{this.id =p.get('id')});
        console.log(this.id);
        this.getProducts();
        
    }

    getProducts()
    {
        this.productservice.getProducts()
            .then((r)=>{
            this.products=r;
            console.log(this.products);
            this.getDetails();
            })
            .catch((err)=>
            {
            console.log(err);
            })
            
    }

    getDetails()
    {
        console.log(this.id);
        for(let value=0;value<this.products.length;value++)
        {
            if(this.id == this.products[value].productCode)
            {
                this.product.description=this.products[value].description;
                this.product.imageUrl=this.products[value].imageUrl;
                this.product.productName=this.products[value].productName;
                this.product.productCode=this.products[value].productCode;
                this.product.releaseDate=this.products[value].releaseDate;
                this.product.price=this.products[value].price;
                this.product.starRating=this.products[value].starRating;
                console.log(this.product);
            }
        }
    }
}