import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {TimelinesComponent} from './timelines/timelines.component';
import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {DanhSachTuDienComponent} from './tra-cuu-tu-dien/danh-sach-tu-dien/danh-sach-tu-dien.component';
import {ChiTietTuDienComponent} from './tra-cuu-tu-dien/chi-tiet-tu-dien/chi-tiet-tu-dien.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './product/product-delete/product-delete.component';


const routes: Routes = [
  {path: 'timelines', component: TimelinesComponent},
  {
    path: 'youtube', component: YoutubePlaylistComponent,
    children: [{
      path: 'id', component: YoutubePlayerComponent
    }]
  },

  {path: 'tuDien-list', component: DanhSachTuDienComponent},
  {path: 'chiTiet/:id', component: ChiTietTuDienComponent},


  {path: 'product/list', component: ProductListComponent},
  {path: 'product/create', component: ProductCreateComponent},
  {path:'product/edit/:id', component: ProductEditComponent},
  {path: 'product/delete/:id', component: ProductDeleteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}


