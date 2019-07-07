import { Routes } from "@angular/router";
import { AddComponent } from './addstudent/addstudent.component';
import { DisplayComponent } from './display/display.component';
import { UpdateComponent } from './update/update.component';

export const routes: Routes = [
    {path:'add',component:AddComponent},
    {path:'display',component:DisplayComponent},
    {path:'update/:id',component:UpdateComponent},
    {path:'',redirectTo:'/display',pathMatch:"full"},
    {path:'**',component:DisplayComponent},

];
