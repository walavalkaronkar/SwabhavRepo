import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms'

@Component({
  selector: 'aurionpro-welcome',
  templateUrl: './welcome.component.html',

})
export class WelcomeComponent {
  message:string;
  studentName:string;

  fontSize:string;
  fontStyle:string;
  backgroundColor:string;
  fontColor:string;
  
  colorOn:string="red";
  colorOff:string="green"
  constructor()
  {
      this.message="welcome to my angular component";
  }

  statechangeHander(e)
  {
    console.log(e);
  }
}
