import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {FacilityListComponent} from './facility-list/facility-list.component';
import {FacilityEditComponent} from './facility-edit/facility-edit.component';
import {FacilityCreateComponent} from './facility-create/facility-create.component';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerEditComponent} from './customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './customer-create/customer-create.component';
import {ContractListComponent} from './contract-list/contract-list.component';
import {CustomerUserFacilityComponent} from './customer-user-facility/customer-user-facility.component';
import {FuramaComponent} from './furama/furama.component';


const routes: Routes = [
  {path: 'facility-list', component: FacilityListComponent},
  {path: 'facility-edit', component: FacilityEditComponent},
  {path: 'facility-create', component: FacilityCreateComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-edit', component: CustomerEditComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  {path: 'contract-list', component: ContractListComponent},
  {path: 'customer-user-facility', component: CustomerUserFacilityComponent},
  {path: 'furama', component: FuramaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
