import { Route } from '@angular/router';
import { HomeComponent } from 'src/home/home.component';
import { AboutUsComponent } from 'src/aboutus/aboutus.component';
import { CareerComponent } from 'src/carrer/career.component';
import { NotFoundComponent } from 'src/notfound/notfound.component';

export const routes:Route[]=[
                        {path:'home',component:HomeComponent},
                        {path:'aboutus',component:AboutUsComponent},
                        {path:'career/:id',component:CareerComponent},
                        {path:'',redirectTo:'home',pathMatch:"full"},
                        {path:'**',component:NotFoundComponent},
                        
                        ]