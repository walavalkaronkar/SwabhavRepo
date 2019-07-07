import { Component } from '@angular/core';
import { MathService } from '../math.service';
import { numbersApi } from '../numbersapi.service';

@Component({
    selector: 'multi-bind',
    templateUrl: './multibind.component.html',

})
export class MultiBindComponent {
    message: string;
    numberApi: string;
    numberResult: string

    studentName: string;
    Evennumber: number;
    fontSize: string;
    result: any;
    fontStyle: string;
    backgroundColor: string;
    fontColor: string;

    constructor(private MathServ: MathService, private numberapi: numbersApi) {
        this.message = "welcome to my angular component";
    }

    cubeEvenNumber(no) {

        this.MathServ.cubeEvenNos(no)
            .then((r) => {
                this.result = r;
                console.log(this.result);
            })
            .catch((err) => {
                this.result = err;
            });
    }


    numbersApiFunction(number) {
        if (number == null) {
            this.numberResult ="Input Number"
        }
        else {
            this.numberapi.getNumberDetails(number)
                .then((r) => {
                    this.numberResult = r;
                    //console.log(this.numberResult);
                })
                .catch((err) => {
                    this.numberResult = err;
                });
        }

    }
}
