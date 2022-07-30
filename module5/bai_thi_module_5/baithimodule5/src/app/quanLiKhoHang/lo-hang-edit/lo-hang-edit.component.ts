import { Component, OnInit } from '@angular/core';
import {LoHang} from '../../model/lo-hang';
import {FormGroup} from '@angular/forms';
import {SanPham} from '../../model/san-pham';
import {LoHangService} from '../../service/lo-hang.service';
import {SanPhamService} from '../../service/san-pham.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';



@Component({
  selector: 'app-lo-hang-edit',
  templateUrl: './lo-hang-edit.component.html',
  styleUrls: ['./lo-hang-edit.component.css']
})
export class LoHangEditComponent implements OnInit {
  formLoHang: FormGroup;
  id: number
  loHang: LoHang;

  sanPham: SanPham[]= [];
  constructor(private loHangService: LoHangService,
              private sanPhamService: SanPhamService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      this.id= paramMap.get(id)
    })
  }

  ngOnInit(): void {

  }

}
