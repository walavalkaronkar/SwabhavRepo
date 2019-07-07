import { Injectable } from "@angular/core";

@Injectable()
export class MathService{
    constructor()
    {
        console.log("Invoked math service");
    }

    cubeEvenNos(no)
    {
        return new Promise((resolve,reject)=>
        {
            if(no %2 ==0)
            {
                return resolve(no*no*no);
            }
            else
            {
                return reject("no is even number")
            }
        })
    }
}