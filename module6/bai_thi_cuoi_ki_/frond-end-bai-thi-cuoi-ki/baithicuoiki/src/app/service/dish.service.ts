import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Dish} from '../model/dish';

@Injectable({
  providedIn: 'root'
})
export class DishService {


  private URL_DISH = "http://localhost:8080/dish"
  private URL_DISH_TYPE = "http://localhost:8080/dishType"

  constructor(private httpClient: HttpClient,) {}


  getDishPage(page: number,dishName:string,dishCode:String,dishPrice:string,dishTypeId:string): Observable<Dish[]> {

    return this.httpClient.get<Dish[]>(this.URL_DISH + "/searchDish?page=" + page+"&dishName="+dishName+"&dishCode="+dishCode+"&dishPrice="+dishPrice+"&dishTypeId="+dishTypeId);
  }


  deleteDishById(id: number): Observable<Dish> {
    // @ts-ignore
    return this.httpClient.patch<Dish>(this.URL_DISH + "/delete/" + id,null)
  }

  getAllDishType(): Observable<Dish[]>{
    return this.httpClient.get<Dish[]>(this.URL_DISH_TYPE+"/getDishTypeList");
  }
}
