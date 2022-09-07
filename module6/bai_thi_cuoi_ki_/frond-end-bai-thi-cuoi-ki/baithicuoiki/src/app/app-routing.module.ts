import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DishListComponent} from './dish-list/dish-list.component';
import {SanPhamlistComponent} from './san-phamlist/san-phamlist.component';
import {CreateSanPhamComponent} from './create-san-pham/create-san-pham.component';


const routes: Routes = [
  {path: "dish", component: DishListComponent},
  {path: "san-pham-list", component: SanPhamlistComponent},
  {path: "create-san-pham", component: CreateSanPhamComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
