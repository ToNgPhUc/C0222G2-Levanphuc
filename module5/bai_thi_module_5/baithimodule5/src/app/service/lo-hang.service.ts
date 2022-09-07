import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {LoHang} from '../model/lo-hang';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoHangService {
  private API_URL = 'http://localhost:8080/quan-li-lo-hang';

  constructor(private http: HttpClient) {
  }

  // getAll(): Observable<LoHang[]> {
  //   return this.http.get<LoHang[]>(this.API_URL+"/lo-hang");
  // }
  saveLoHang(loHang: LoHang): Observable<LoHang> {
    return this.http.post<LoHang>(this.API_URL + '/create', loHang);
  }

  deleteLoHang(id: number): Observable<LoHang> {
    return this.http.delete<LoHang>(this.API_URL + `/${id}`);
  }


  findById(id: number): Observable<LoHang> {
    return this.http.get<LoHang>(this.API_URL + `/${id}`);
  }

  editLoHang(id: number, loHang: LoHang) {
    return this.http.put<LoHang>(this.API_URL + `/${id}`, loHang);

  }

  searchByName(searchName: string): Observable<LoHang[]> {
    return this.http.get<LoHang[]>(this.API_URL + '?sanPham.tenSanPham_like=' + searchName);
  }

  // searchByName(searchObj: any): Observable<LoHang[]> {
  //   let ngayNhapHangSearch = searchObj.NgayNhapHangSearch;
  //   let searchName = searchObj.searchName;
  //   let ngaySanXuatSearch = searchObj.NgaySanXuatSearch;
  //   let ngayHetHanSearch = searchObj.NgayHetHanSearch;
  //   if (searchName == null) {
  //     searchName = '';
  //   }
  //   if (ngayNhapHangSearch == null) {
  //     ngayNhapHangSearch = '';
  //   }
  //   if (ngaySanXuatSearch == null) {
  //     ngaySanXuatSearch = '01-01-0001';
  //   }
  //   if (ngayHetHanSearch == null) {
  //     ngayHetHanSearch = '01-01-8000';
  //   }
  //   return this.http.get<LoHang[]>(this.API_URL + '&sanPham.tenSanPham_like=' + searchName + '&ngayNhapHang_like=' + ngayNhapHangSearch + '?ngaySanXuat_gte=' + ngaySanXuatSearch + '&ngayHetHan_lte=' + ngayHetHanSearch);
  // }

  findAllLoHang(searchName: string,ngayNhapHangSearch:string, page: number): Observable<LoHang[]> {
    return this.http.get<LoHang[]>(this.API_URL + '/lo-hang?page=' + page + '&search=' + searchName + "&ngayNhapHang="+ngayNhapHangSearch);
  }
}
