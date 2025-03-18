import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { ManagerComponent } from './manager/manager.component'

const routes: Routes = [
 
  { path: 'adminlogin', component: AdminloginComponent }, // Admin login page
  { path: 'admindash', component: AdmindashComponent }, // Admin dashboard page
  { path: 'manager', component: ManagerComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
