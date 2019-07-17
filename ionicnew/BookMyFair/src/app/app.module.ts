import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { OtpPopUpComponent } from './component/otpPopUp/otpPopUp.component';
import { FormsModule } from '@angular/forms';
import { RegisterComponent } from './component/register/register.page';
import { MainUrlService } from './services/apiservices/mainurl.service';
import { OrganizerIdService } from './services/apiservices/organizerId.service';
import { SocietyRoleService } from './services/apiservices/societyrole.service';
import { HttpClientModule } from '@angular/common/http';
import { RegisterService } from './services/apiservices/register.service';
import { EventsService } from './services/apiservices/events.service';
import { OTPService } from './services/apiservices/otp.service';
import { LoginService } from './services/apiservices/login.service';
import { HomeComponent } from './component/homepage/home.component';
import { ConstantService } from './services/apiservices/constant.service';
import { VisitorFieldComponent } from './component/visitorfield/visitorfield.component';
import { UtlityService } from './services/apiservices/Utility.service';
import { StorageService } from './services/apiservices/storage.service';
import { LoaderService } from './services/apiservices/loader.service';
import { Keyboard } from '@ionic-native/keyboard/ngx';

@NgModule({
  declarations: [AppComponent,OtpPopUpComponent,RegisterComponent,HomeComponent,VisitorFieldComponent],
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
    OTPService,
    LoginService,
    ConstantService,
    UtlityService,
    StorageService,
    LoaderService,
    Keyboard
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
