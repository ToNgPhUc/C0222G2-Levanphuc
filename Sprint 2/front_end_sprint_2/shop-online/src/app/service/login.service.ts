import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private AUTHENTICATION_URL = 'http://localhost:8080/authenticate';
  constructor(private http: HttpClient) {

  }

  login(username: string, password: string):Observable<any> {
// @ts-ignore
    return this.http.post<Observable<any>>(this.AUTHENTICATION_URL);
  }
}
