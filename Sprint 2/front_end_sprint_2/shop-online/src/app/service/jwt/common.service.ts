import { Injectable } from '@angular/core';
import {Observable, Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {
  constructor() { }

  private subjectName = new Subject<any>(); //  cần tạo một chủ đề

  sendUpdate(message: string) { //thành phần muốn cập nhật thứ gì đó, gọi đây là fn
    this.subjectName.next({ text: message }); //next () sẽ cung cấp giá trị trong Chủ đề
  }

  getUpdate(): Observable<any> { //thành phần bộ thu gọi hàm này
    return this.subjectName.asObservable(); //nó trả về dưới dạng có thể quan sát được mà bộ phận máy thu sẽ đăng ký
  }
}
