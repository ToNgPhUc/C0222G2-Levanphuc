import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListMonMoiComponent } from './caPheThongMinh/list-mon-moi/list-mon-moi.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { CreateMonMoiComponent } from './caPheThongMinh/create-mon-moi/create-mon-moi.component';
import {environment} from '../environments/environment';
import {AngularFireStorageModule} from '@angular/fire/storage';
import {AngularFireDatabaseModule} from '@angular/fire/database';
import {AngularFireModule} from '@angular/fire';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { EditMonMoiComponent } from './caPheThongMinh/edit-mon-moi/edit-mon-moi.component';

@NgModule({
  declarations: [
    AppComponent,
    ListMonMoiComponent,
    FooterComponent,
    HeaderComponent,
    CreateMonMoiComponent,
    EditMonMoiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    AngularFireStorageModule,
    AngularFireDatabaseModule,
    ReactiveFormsModule,


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
