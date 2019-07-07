import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class numbersApi{

    url:string="http://numbersapi.com";
    constructor(private http:HttpClient)
    {
        console.log("Invoked numbers service");
    }
    
    getNumberDetails(no):Promise<string>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.get(this.url+"/"+no,{responseType: 'text'})
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response.toString());
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }


    getNumberDet(no):Promise<string>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.get(this.url+"/"+no,{responseType: 'text'})
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response.toString());
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }
}
