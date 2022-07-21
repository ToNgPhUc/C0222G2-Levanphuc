import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {FacilityListComponent} from './facility-list/facility-list.component';
import {FacilityEditComponent} from './facility-edit/facility-edit.component';
import {FacilityCreateComponent} from './facility-create/facility-create.component';
import {CustomerListComponent} from './customer-list/customer-list.component';


const routes: Routes = [
  {path: 'facility-list', component: FacilityListComponent},
  {path: 'facility-edit', component: FacilityEditComponent},
  {path: 'facility-create', component: FacilityCreateComponent},
  {path: 'customer-list', component: CustomerListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
