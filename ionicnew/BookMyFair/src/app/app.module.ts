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
import { MainService } from './services/apiservices/main.service';
import { HttpClientModule } from '@angular/common/http';
import { VisitorService } from './services/apiservices/visitor.service';
import { EventsService } from './services/apiservices/events.service';
import { HomeComponent } from './component/homepage/home.component';
import { ConstantService } from './services/apiservices/constant.service';
import { VisitorFieldComponent } from './component/visitorfield/visitorfield.component';
import { UtilityService } from './services/apiservices/utility.service';
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
    MainService,
    VisitorService,
    EventsService,
    ConstantService,
    UtilityService,
    StorageService,
    LoaderService,
    Keyboard
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
