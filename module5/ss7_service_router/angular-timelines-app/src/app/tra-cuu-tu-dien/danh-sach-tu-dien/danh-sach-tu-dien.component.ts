import { Component, OnInit } from '@angular/core';
import {TuDienService} from '../../service/tu-dien.service';
import {TuDien} from '../../model/tu-dien';

@Component({
  selector: 'app-danh-sach-tu-dien',
  templateUrl: './danh-sach-tu-dien.component.html',
  styleUrls: ['./danh-sach-tu-dien.component.css']
})
export class DanhSachTuDienComponent implements OnInit {
  tuDienList: TuDien[]=[]

  constructor(private tuDienService: TuDienService) { }

  ngOnInit(): void {
    this.getAll()
  }
  getAll(){
    this.tuDienList=this.tuDienService.getAll()
  }


}
