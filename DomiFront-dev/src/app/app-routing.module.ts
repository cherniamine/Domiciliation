import { NgModule } from '@angular/core';
import { RouteReuseStrategy, RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./Authentification/login/login.component";
import {DepotdomiciliationComponent} from "./Domiciliation/depotdomiciliation/depotdomiciliation.component";
import {SidebarComponent} from "./SideBar/sidebar/sidebar.component";
import {AllTemplateComponent} from "./all-template/all-template.component";
import {NavbarComponent} from "./navbar/navbar.component";
import {PriseEnChargeAccordBctComponent} from "./prise-en-charge-accord-bct/prise-en-charge-accord-bct.component";
import { AuthGuard } from './helper/Guard/auth-guard.guard';
import { CustomReuseStrategy } from './custom-reuse-strategy';

const routes: Routes = [
  { path: "", redirectTo: "login", pathMatch: 'full' },
  { path: "login", component: LoginComponent },
  {
    path: "DepotDomiciliation",
    component: DepotdomiciliationComponent,
    canActivate: [AuthGuard] 
  },
  {
    path: 'home',
    component: AllTemplateComponent,
    canActivate: [AuthGuard],
    children: [
      { path: 'depot', component: DepotdomiciliationComponent }, 
      { path: 'prise-en-charge-accord-bct', component: PriseEnChargeAccordBctComponent }
    ]
  },
  { path: "navbar", component: NavbarComponent, canActivate: [AuthGuard] },
  { path: "prise-en-charge-accord-bct", component: PriseEnChargeAccordBctComponent, canActivate: [AuthGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  providers: [
    { provide: RouteReuseStrategy, useClass: CustomReuseStrategy } 
  ],  
  exports: [RouterModule]
})
export class AppRoutingModule { }
