import {Injectable} from '@angular/core';
import {TuDien} from '../model/tu-dien';

@Injectable({
  providedIn: 'root'
})
export class TuDienService {
  tuDienList: TuDien[] = [{
    id: 0,
    name: 'learn',
    mean: 'học'
  },
    {
      id: 1,
      name: 'sleep',
      mean: 'ngủ'
    },
    {
      id: 2,
      name: 'eat',
      mean: 'ăn'
    }];

  constructor() {
  }

  getAll() {
    return this.tuDienList;
  }

  findById(number: number) {
    return this.tuDienList.filter(tuDien=> tuDien.id === number);
  }
}
