import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Dish} from '../model/dish';

@Injectable({
  providedIn: 'root'
})
export class DishService {
  private API_URL = 'http://localhost:8080/ca_phe_thong_minh';
  constructor(private http: HttpClient) {

  }
  getAll(): Observable<Dish[]>{
    return this.http.get<Dish[]>(this.API_URL+"/Dish");
  }

  saveDish(dish: Dish): Observable<Dish> {
    return this.http.post<Dish>(this.API_URL + '/create', dish);
  }

  findById(id: number): Observable<Dish> {
    return this.http.get<Dish>(this.API_URL + `/${id}`);
  }

   editDish(id: number, dish: Dish): Observable<Dish> {
    return this.http.patch<Dish>(this.API_URL + `/${id}`, dish);
  }




}
