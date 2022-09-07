import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CreateMonMoiComponent} from './caPheThongMinh/create-mon-moi/create-mon-moi.component';
import {ListMonMoiComponent} from './caPheThongMinh/list-mon-moi/list-mon-moi.component';
import {EditMonMoiComponent} from './caPheThongMinh/edit-mon-moi/edit-mon-moi.component';


const routes: Routes = [
  {path: 'create-mon-moi', component: CreateMonMoiComponent},
  {path: 'list-mon-moi', component: ListMonMoiComponent},
  {path: 'edit-mon-moi/:id', component: EditMonMoiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
