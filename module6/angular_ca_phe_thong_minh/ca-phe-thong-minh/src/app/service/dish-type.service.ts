import { Injectable } from '@angular/core';
import {DishType} from '../model/dish-type';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DishTypeService {

  private API_URL = "http://localhost:8080/ca_phe_thong_minh/DishType"

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<DishType[]> {
    return this.http.get<DishType[]>(this.API_URL);
  }
}
