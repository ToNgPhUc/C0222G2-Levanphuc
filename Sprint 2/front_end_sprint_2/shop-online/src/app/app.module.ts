import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomePageComponent } from './home-page/home-page.component';
import {LoginModule} from './login/login.module';
import {ShareModule} from './share/share.module';
import {LoginComponent} from './login/login/login.component';
import { DetailComponent } from './detail/detail.component';
import {DetailModule} from './detail/detail.module';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductCreateComponent } from './product/product-create/product-create.component';
import {ProductModule} from './product/product.module';
import { CardComponent } from './card/card.component';
import {CardModule} from './card/card.module';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomePageComponent,
    LoginComponent,
    DetailComponent,
    ProductListComponent,
    ProductCreateComponent,
    CardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LoginModule,
    ShareModule,
    DetailModule,
    ProductModule,
    CardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
