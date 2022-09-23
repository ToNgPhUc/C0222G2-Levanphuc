import {Injectable} from '@angular/core';
import {Oder} from '../../model/oder';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {CookieService} from '../jwt/cookie.service';
import {Customer} from '../../model/customer';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private API_URL = 'http://localhost:8080/oder-cart';
  private header = 'Bearer ' + this.cookieService.getCookie('jwToken');

  constructor(private httpClient: HttpClient,
              private cookieService: CookieService) {
  }

  addOrder(oder: Oder): Observable<Oder> {
    return this.httpClient.post(this.API_URL + '/add/cart', oder, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  // findAllOder(page: number):Observable<Oder[]> {
  //   return this.httpClient.get<Oder[]>(this.API_URL+ '/oder-cart-list?page=' +page,{headers: new HttpHeaders({'authorization': this.header})}).pipe()
  // }

  getProductInCardByCustomer(customer: Customer): Observable<Oder[]> {
    return this.httpClient.post <Oder[]>(this.API_URL + '/cart/products', customer, {headers: new HttpHeaders({'authorization': this.header})}).pipe();
  }

  minusQuantity(productOrder: Oder): Observable<Oder[]> {
    return this.httpClient.post<Oder[]>(this.API_URL + '/cart/minus/quantity', productOrder, {headers: new HttpHeaders({'authorization': this.header})});
  }

  plusQuantity(productOrder: Oder): Observable<Oder[]> {
    return this.httpClient.post<Oder[]>(this.API_URL + '/cart/plus/quantity', productOrder,{headers: new HttpHeaders({'authorization':this.header})});
  }

  deleteProductInCard(po: Oder): Observable<any> {
    return this.httpClient.post(this.API_URL + '/cart/delete', po, {headers: new HttpHeaders({'authorization': this.header})});
  }

  goPayment(customer: Customer): Observable<any> {
    return this.httpClient.post(this.API_URL + '/cart/payment', customer, {headers: new HttpHeaders({'authorization': this.header})});
  }

  historyOder(page:number,customer: Customer): Observable<Oder[]> {
    return this.httpClient.post<Oder[]>(this.API_URL + '/history/oder?page=' + page, customer,{headers: new HttpHeaders({'authorization': this.header})});
  }
}
