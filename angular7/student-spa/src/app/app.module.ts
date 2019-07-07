import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms"
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentService } from 'src/services/studentservice.service';
import { DisplayComponent } from './display/display.component';
import { HttpClientModule } from '@angular/common/http';
import { GenderPipes } from 'src/services/genderPipe.pipe';
import { AddComponent } from './addstudent/addstudent.component';
import { UpdateComponent } from './update/update.component';
import { SearchPipes } from 'src/services/searchPipe.pipe';


@NgModule({
  declarations: [
    AppComponent,
    DisplayComponent,
    GenderPipes,
    AddComponent,
    UpdateComponent,
    SearchPipes
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
