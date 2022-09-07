import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {HttpClientModule} from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';
import {ReactiveFormsModule} from '@angular/forms';
import {SanPhamComponent} from './quanLiKhoHang/san-pham/san-pham.component';
import {LoHangListComponent} from './quanLiKhoHang/lo-hang-list/lo-hang-list.component';
import {LoHangCreateComponent} from './quanLiKhoHang/lo-hang-create/lo-hang-create.component';
import {LoHangEditComponent} from './quanLiKhoHang/lo-hang-edit/lo-hang-edit.component';
import {environment} from '../environments/environment';
import {AngularFireModule} from '@angular/fire';
import { CreateMonMoiComponent } from './caPheThongMinh/create-mon-moi/create-mon-moi.component';
import {AngularFireStorageModule} from '@angular/fire/storage';
import {AngularFireDatabaseModule} from '@angular/fire/database';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SanPhamComponent,
    LoHangListComponent,
    LoHangCreateComponent,
    LoHangEditComponent,
    CreateMonMoiComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    AngularFireStorageModule,
    AngularFireDatabaseModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
