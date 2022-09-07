import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Dish} from '../model/dish';

@Injectable({
  providedIn: 'root'
})
export class DishTypeService {

  private URL_DISH_TYPE = "http://localhost:8080/dishType"

  constructor(private httpClient: HttpClient) {
  }
}
