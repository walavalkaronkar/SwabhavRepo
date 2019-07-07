import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'snakeCase'
})

export class SnakeCase implements PipeTransform {
    transform(val : string ) : string {
        let v="" 
        console.log(val);
        if(val != undefined) 
        {
            let value=val.split(" ");
            for(let i=0;i<value.length;i++)
            {
                value[i]=value[i]+"_";
                v=v+""+value[i];
            }
            v=v+""+value[value.length];
            console.log(v);         
        }
        return v;
      }  
}
