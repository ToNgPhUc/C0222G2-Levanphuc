import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SanPham} from '../model/san-pham';

@Injectable({
  providedIn: 'root'
})
export class SanPhamService {
  private API_URL = "http://localhost:8080/quan-li-lo-hang/san-pham"

  constructor(private http: HttpClient) {
  }


  getAll(): Observable<SanPham[]> {
    return this.http.get<SanPham[]>(this.API_URL);
  }
}
