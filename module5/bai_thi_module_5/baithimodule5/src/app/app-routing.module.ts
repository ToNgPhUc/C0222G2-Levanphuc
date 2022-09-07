import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoHangListComponent} from './quanLiKhoHang/lo-hang-list/lo-hang-list.component';
import {LoHangCreateComponent} from './quanLiKhoHang/lo-hang-create/lo-hang-create.component';
import {LoHangEditComponent} from './quanLiKhoHang/lo-hang-edit/lo-hang-edit.component';
import {CreateMonMoiComponent} from './caPheThongMinh/create-mon-moi/create-mon-moi.component';


const routes: Routes = [
  {path: "lo-hang-list", component: LoHangListComponent},
  {path: "lo-hang-create", component: LoHangCreateComponent},
  {path: "lo-hang-edit/:id", component: LoHangEditComponent},
  {path:"mon-moi-create", component: CreateMonMoiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
