import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component
({
    selector: 'btn-toggle',
    templateUrl: './button.component.html',

})
export class ToggleButtonComponent
{
    myColor:string;

    @Input()
    valueForTest:string;

    @Input()
    OnColor:string;

    @Input()
    OffColor:string;

    @Output()
    stateChange:EventEmitter<string>;

    status:boolean=false;

    constructor()
    {
        console.log("Inside Constructor");
        this.valueForTest="";
        this.myColor="red";
        this.stateChange=new EventEmitter<string>();
    }
    OnInit() {
        console.log("inside OnInit");
        console.log(this.valueForTest);
        console.log();    
    }

    clickHandler(e)
    {
        console.log(e);
        console.log("");
        this.stateChange.emit("state changed :On");
        if(this.status==false)
        {
            this.myColor=this.OffColor;
            this.status=true;
        }
        else
        {
            this.myColor=this.OnColor;
            this.status=false;
        }
           
    }
}

