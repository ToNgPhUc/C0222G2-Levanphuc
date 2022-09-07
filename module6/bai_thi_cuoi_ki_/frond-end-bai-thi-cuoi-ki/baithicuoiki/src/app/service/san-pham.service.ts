import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SanPham} from '../model/san-pham';

@Injectable({
  providedIn: 'root'
})
export class SanPhamService {
  private API_URL = "http://localhost:8080/sanPham"

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<SanPham[]> {
    return this.http.get<SanPham[]>(this.API_URL)
  }


  deleteSanPham(id: number): Observable<SanPham> {
    return this.http.delete<SanPham>(this.API_URL + `/${id}`);
  }

  save(sanPham: SanPham): Observable<SanPham> {
    return this.http.post<SanPham>(this.API_URL + '/create', sanPham);
  }


}
