import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './component/register/register.page';
import { HomeComponent } from './component/homepage/home.component';
import { AppComponent } from './app.component';
import { ProfileComponent } from './component/profile/profile.component';

const routes: Routes = [
  
  { path: 'register', component:RegisterComponent},
  { path: 'home', component:HomeComponent},
  { path: 'profile', component:ProfileComponent},
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
