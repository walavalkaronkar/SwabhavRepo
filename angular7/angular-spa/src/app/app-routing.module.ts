import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import {routes} from './RouteConfig'



@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})

export class AppRoutingModule { }
