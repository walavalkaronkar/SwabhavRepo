import { NgModule } from "@angular/core";
import {FormsModule} from '@angular/forms'

import { BrowserModule } from '@angular/platform-browser';

import { WelcomeComponent } from './welcome.component';
import {StudentComponent} from '../student/student.component'
import { BlueBallComponent } from '../blueball/blueball.component';
import {MultiBindComponent} from '../multibind/multibind.component'
import { MathService } from '../math.service';
import { numbersApi } from '../numbersapi.service';
import { HttpClientModule } from '@angular/common/http';
import { SnakeCase } from '../snakeCase.service';
import { ToggleButtonComponent } from '../button/button.component';
import { ButtonRating } from '../button/btnrating.component';


@NgModule({
    declarations: [
        WelcomeComponent,
        StudentComponent,
        BlueBallComponent,
        MultiBindComponent,
        SnakeCase,
        ToggleButtonComponent,
        ButtonRating
      ],
      imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule

      ],
      providers: [MathService,
        numbersApi],
      bootstrap: [WelcomeComponent]
})
export class WelcomeModule { }