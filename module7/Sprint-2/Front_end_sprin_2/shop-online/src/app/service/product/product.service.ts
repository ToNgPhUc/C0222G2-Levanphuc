import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Product} from '../../model/product';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {CookieService} from '../jwt/cookie.service';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private API_URL = 'http://localhost:8080/product';
  private header = 'Bearer ' + this.cookieService.getCookie('jwToken');

  constructor(private http: HttpClient, private cookieService: CookieService) {
  }

  findAllProduct(page: number, searchName: string): Observable<Product[]> {
    return this.http.get<Product[]>(this.API_URL + '/product-search?page=' + page + '&searchName=' + searchName, {headers: new HttpHeaders({'authorization': this.header})});
  }

  saveProduct(product: Product): Observable<Product> {
    console.log(this.header);
    return this.http.post<Product>(this.API_URL + '/create-product', product, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

}
