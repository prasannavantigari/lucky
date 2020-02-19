import {NgModule} from '@angular/core';
import{RouterModule,Routes} from '@angular/router';
import { LoginComponent } from './component/login/login.component';
import { RegisterComponent } from './component/register/register.component';
import { HomeComponent } from './component/home/home.component';
import { ProductsComponent } from './products/products.component';
import { CartComponent } from './component/cart/cart.component';
import { PageNotFoundComponent } from './component/page-not-found/page-not-found.component';

const routes:Routes=[
    {path:'login',component:LoginComponent},
    {path:'register',component:RegisterComponent},
    {path:'home',component:HomeComponent},
    {path:'products',component:ProductsComponent},
    {path:'cart',component:CartComponent},
    {path: 'page-not-found',component:PageNotFoundComponent}
]

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{

}