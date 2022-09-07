import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoaiSanPham} from '../model/loai-san-pham';

@Injectable({
  providedIn: 'root'
})
export class LoaiSanPhamService {

  private API_URL = "http://localhost:8080/sanPham"

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<LoaiSanPham[]> {
    return this.http.get<LoaiSanPham[]>(this.API_URL+"/loai-san-pham")
  }
}
