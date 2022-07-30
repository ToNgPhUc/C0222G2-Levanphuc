import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {SanPham} from '../../model/san-pham';
import {Router} from '@angular/router';
import {SanPhamService} from '../../service/san-pham.service';
import {LoHangService} from '../../service/lo-hang.service';

@Component({
  selector: 'app-lo-hang-create',
  templateUrl: './lo-hang-create.component.html',
  styleUrls: ['./lo-hang-create.component.css']
})
export class LoHangCreateComponent implements OnInit {
  formLoHang: FormGroup;
  sanPham: SanPham[] = []
  constructor( private sanPhamService: SanPhamService,
               private loHangService: LoHangService,
               private router: Router) { }

  ngOnInit(): void {
    this.getAllHocLuc()

    this.formLoHang= new FormGroup({
      id: new FormControl("",[Validators.required]),
      maLoHang: new FormControl("",[Validators.required,Validators.pattern("^LH-[0-9]{4}$")]),
      sanPham: new FormControl("",[Validators.required]),
      soLuong: new FormControl("",[Validators.required,Validators.min(0)]),
      ngayNhapHang: new FormControl("",[Validators.required]),
      ngaySanXuat: new FormControl("",[Validators.required]),
      ngayHetHan: new FormControl("",[Validators.required]),
    })

  }

  createLoHang() {
    const loHang = this.formLoHang.value;
    this.loHangService.saveLoHang(loHang).subscribe(()=>{
        this.formLoHang.reset();
        this.router.navigateByUrl("/lo-hang-list").then()
        alert("thành công")
      },
      error => {
        console.log(error)
      })
  }

  getAllHocLuc() {
    this.sanPhamService.getAll().subscribe(data => {
      this.sanPham= data
    })
  }
}
