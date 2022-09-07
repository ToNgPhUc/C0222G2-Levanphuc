import {Component, OnInit} from '@angular/core';
import {LoHang} from '../../model/lo-hang';
import {FormControl, FormGroup} from '@angular/forms';
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
  id: number;
  loHang: LoHang;

  sanPham: SanPham[] = [];

  constructor(private loHangService: LoHangService,
              private sanPhamService: SanPhamService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {

    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getLoHang(this.id);

    });
  }

  ngOnInit(): void {
    this.getAllSanPham();
  }


  private getLoHang(id: number) {
    return this.loHangService.findById(id).subscribe(data => {
      this.loHang = data
      this.formLoHang = new FormGroup({
        id: new FormControl(this.loHang.id),
        maLoHang: new FormControl(this.loHang.maLoHang),
        soLuong: new FormControl(this.loHang.soLuong),
        ngayNhapHang: new FormControl(this.loHang.ngayNhapHang),
        ngaySanXuat: new FormControl(this.loHang.ngaySanXuat),
        ngayHetHan: new FormControl(this.loHang.ngayHetHan),
        sanPham: new FormControl(this.loHang.sanPham.tenSanPham),
      });
    });
  }


  editLoHang(id: number) {
    const loHang = this.formLoHang.value
    this.loHangService.editLoHang(id, loHang).subscribe((data) => {
        this.router.navigateByUrl("/lo-hang-list").then();
        alert("thành công")
      },
      error => {
        console.log(error)
      })
  }

  getAllSanPham() {
    this.sanPhamService.getAll().subscribe((data) => {
      this.sanPham = data
    })
  }
}
