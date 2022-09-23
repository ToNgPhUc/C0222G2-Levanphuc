import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {ToastrModule} from 'ngx-toastr';
import {HttpClientModule} from '@angular/common/http';
import {LoginComponent} from './login/login/login.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {DetailComponent} from './detail/detail.component';
import {HomePageComponent} from './home-page/home-page.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {CartComponent} from './cart/cart/cart.component';
import {AngularFireStorageModule} from '@angular/fire/storage';
import {AngularFireModule} from '@angular/fire';
import {environment} from '../environments/environment';
import {AngularFireDatabaseModule} from '@angular/fire/database';
import {CKEditorModule} from '@ckeditor/ckeditor5-angular';
import { LoadingComponent } from './loading/loading.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HistoryCartComponent } from './cart/history-cart/history-cart.component';
import { PersonalInformationComponent } from './customer/personal-information/personal-information.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    ProductListComponent,
    ProductCreateComponent,
    DetailComponent,
    HomePageComponent,
    CartComponent,
    LoadingComponent,
    HistoryCartComponent,
    PersonalInformationComponent,

  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    ToastrModule.forRoot(
      {
        timeOut: 2000,
        closeButton: true,
        progressBar: true,
        positionClass: 'toast-top-left',
        preventDuplicates: true,
      }
    ),
    FormsModule,
    ReactiveFormsModule,
    AngularFireStorageModule,
    AngularFireModule.initializeApp(environment.firebase),
    AngularFireDatabaseModule,
    CKEditorModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
