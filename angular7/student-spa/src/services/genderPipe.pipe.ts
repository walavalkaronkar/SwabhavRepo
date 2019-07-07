import { Pipe, PipeTransform } from '@angular/core';
import { stringify } from '@angular/core/src/util';

@Pipe({
    name: 'GenderPipe'
})

export class GenderPipes implements PipeTransform {
    gender:string
    transform(val : boolean ) : string {
        
        if(val)
        {
            this.gender="male";
        }
        else
        {
            this.gender="female";
        }
        return this.gender;
      }  
}

