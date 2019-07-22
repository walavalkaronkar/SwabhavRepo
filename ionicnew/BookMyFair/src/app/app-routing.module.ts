import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './component/register/register.page';
import { HomeComponent } from './component/homepage/home.component';
import { AppComponent } from './app.component';
import { ProfileComponent } from './component/profile/profile.component';
import { ShowTicketsComponent } from './component/showtickets/showtickets.component';

const routes: Routes = [
  
  { path: 'register', component:RegisterComponent},
  { path: 'home', component:HomeComponent},
  { path: 'profile', component:ProfileComponent},
  {path:'showtickets',component:ShowTicketsComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
