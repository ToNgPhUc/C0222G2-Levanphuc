import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CookieService} from './cookie.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private AUTHENTICATION_URL = "http://localhost:8080/authenticate";


  constructor(private httpClient: HttpClient) { }

  onLogin(username: string, password: string):Observable<any> {
    const user = {username: username, password: password};
    console.log(user);
    return this.httpClient.post<Observable<any>>(this.AUTHENTICATION_URL, user,
      {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

}
