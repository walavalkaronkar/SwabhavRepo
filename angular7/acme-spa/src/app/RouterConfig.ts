import { Routes } from "@angular/router";
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './productlist/productlist.component';
import { ProductsDetailsComponent } from './productdetails/productsdetails.component';


export const routes: Routes = [
    {path:"welcome",component:WelcomeComponent},
    {path:"productlist",component:ProductListComponent},
    {path:"productsdetails/:id",component:ProductsDetailsComponent},
    {path:'',redirectTo:'/welcome',pathMatch:"full"},
    {path:'**',component:WelcomeComponent}
];