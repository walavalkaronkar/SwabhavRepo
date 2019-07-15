import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { OtpPopUpComponent } from './component/setting/otpPopUp.component';
import { FormsModule } from '@angular/forms';
import { HomePage } from './component/home/home.page';
import { MainUrlService } from './services/apiservices/mainurl.service';
import { OrganizerIdService } from './services/apiservices/organizerId.service';
import { SocietyRoleService } from './services/apiservices/societyrole.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RegisterService } from './services/apiservices/register.service';
import { EventsService } from './services/apiservices/events.service';
import { OTPService } from './services/apiservices/otp.service';

@NgModule({
  declarations: [AppComponent,OtpPopUpComponent,HomePage],
  entryComponents: [OtpPopUpComponent],
  imports: [BrowserModule, IonicModule.forRoot(), AppRoutingModule,FormsModule,HttpClientModule],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy },
    MainUrlService,
    OrganizerIdService,
    SocietyRoleService,
    RegisterService,
    EventsService,
    OTPService
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
