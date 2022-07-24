import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DangKiComponent } from './dang-ki/dang-ki.component';
import {ReactiveFormsModule} from '@angular/forms';
import { DangNhapComponent } from './dang-nhap/dang-nhap.component';

@NgModule({
  declarations: [
    AppComponent,
    DangKiComponent,
    DangNhapComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
