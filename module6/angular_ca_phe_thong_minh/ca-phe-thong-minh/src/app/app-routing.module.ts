import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CreateMonMoiComponent} from './caPheThongMinh/create-mon-moi/create-mon-moi.component';


const routes: Routes = [
  {path:"create-mon-moi", component: CreateMonMoiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
