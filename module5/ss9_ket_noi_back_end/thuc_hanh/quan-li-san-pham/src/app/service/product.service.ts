import {Injectable} from '@angular/core';
import {Product} from '../model/product';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private API_URL = " http://localhost:3000/product"

  constructor(private http: HttpClient) {
  }



  getAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.API_URL);
  }


  saveProduct(product): Observable<Product> {
    return this.http.post<Category>(this.API_URL, product);
  }

  findById(id: number): Observable<Product> {
    return this.http.get<Category>(this.API_URL + `/${id}`);
  }

  updateProduct(id: number, product: Product): Observable<Product> {
    return this.http.put<Category>(this.API_URL + `/${id}`, product);
  }

  deleteProduct(id: number): Observable<Product> {
    return this.http.delete<Category>(this.API_URL + `/${id}`);
  }

}
