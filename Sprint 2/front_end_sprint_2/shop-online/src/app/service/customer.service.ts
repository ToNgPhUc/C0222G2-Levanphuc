import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
import {CookieService} from './jwt/cookie.service';
import {AppUser} from '../model/app-user';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private API_URL = 'http://localhost:8080';
  private header = 'Bearer ' + this.cookieService.getCookie('jwToken');
  constructor(private httpClient: HttpClient,
              private cookieService: CookieService) { }


  getCustomerByUserName(username: string): Observable<Customer> {
    return this.httpClient.get<Customer>(this.API_URL + '/get/customer/' + username);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post(this.API_URL  + "/checkout/customer", customer);
  }

  getAppUserFromUsername(username: string):Observable<AppUser> {
    return this.httpClient.get<AppUser>(this.API_URL  + "/get/user/" + username);
  }

  getAllCustomer(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.API_URL  + "/customer/list")
  }

}
