import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../model/customer/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private API_URL = "http://localhost:3000/customer"

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.API_URL)
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.API_URL, customer);
  }

  findById(id: number):Observable<Customer> {
    return this.http.get<Customer>(this.API_URL + `/${id}`)
  }

  editCustomer(id: number, customer: Customer): Observable<Customer> {
    return this.http.put<Customer>(this.API_URL+`/${id}`,customer)
  }

  deleteCustomer(id: number): Observable<Customer> {
    return  this.http.delete<Customer>(this.API_URL+`/${id}`)
  }
}
