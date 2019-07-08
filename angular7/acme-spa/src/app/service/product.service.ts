import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductService{
    url:string="./assets/products.json";
    constructor(private http:HttpClient)
    {
        console.log("In service ");
    }
    
    getProducts():Promise<any>
    {
       return new Promise((resolve,reject)=>{
           this.http.get(this.url)
           .toPromise()
           .then((r)=>{
                resolve(r);
                console.log(r);
           })
           .catch((err)=>{
               reject(err);
               console.log(err);
           })
       })
    }
}