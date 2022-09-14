import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {CookieService} from '../jwt/cookie.service';
import {Observable} from 'rxjs';
import {TypeProduct} from '../../model/type-product';

@Injectable({
  providedIn: 'root'
})
export class TypeProductService {

  private API_URL = "http://localhost:8080/type-product"

  private header = 'Bearer ' + this.cookieService.getCookie('jwToken');
  constructor(private http: HttpClient,private cookieService: CookieService) {
  }

  getAll(): Observable<TypeProduct[]> {
    return this.http.get<TypeProduct[]>(this.API_URL + '/list-type-product',{headers: new HttpHeaders({'authorization': this.header})}).pipe()
  }
}
