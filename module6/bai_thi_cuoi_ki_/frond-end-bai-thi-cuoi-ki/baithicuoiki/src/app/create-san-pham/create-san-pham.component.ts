import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {LoaiSanPham} from '../model/loai-san-pham';
import {LoaiSanPhamService} from '../service/loai-san-pham.service';
import {SanPhamService} from '../service/san-pham.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-san-pham',
  templateUrl: './create-san-pham.component.html',
  styleUrls: ['./create-san-pham.component.css']
})
export class CreateSanPhamComponent implements OnInit {

  formSanPham: FormGroup;
  loaiSanPham: LoaiSanPham[] = [];

  constructor(private loaiSanPhamService: LoaiSanPhamService,
              private sanPhamService: SanPhamService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.formSanPham = new FormGroup({
      id: new FormControl(),
      maSanPham: new FormControl('', [Validators.required]),
      tenSanPham: new FormControl('', [Validators.required]),
      gia: new FormControl('', [Validators.required]),
      ngayNhap: new FormControl('', [Validators.required]),
      tinhTrang: new FormControl("",[Validators.required]),
      xuatXu: new FormControl('', [Validators.required, Validators.pattern('^([0][9][0][0-9]{7})|([0][9][1][0-9]{7})$')]),
      tacGia: new FormControl(),
      theLoai: new FormControl('', [Validators.email, Validators.required]),


    });

  }

  createSanPham() {

    const sanPham = this.formSanPham.value;
    this.sanPhamService.save(sanPham).subscribe(() => {

        this.router.navigateByUrl('/san-pham-list').then();

      },
      error => {
        const maSanPham = this.formSanPham.value.maSanPham
        if (maSanPham == sanPham.maSanPham) {
          error.error.defaultMessage = 'maSanPhamExists'
          this.formSanPham.controls.maSanPham.setErrors({'maSanPhamExists': true})
        }
      });
  }

  getAllLoaiSanPham() {
    this.loaiSanPhamService.getAll().subscribe(data => {
      this.loaiSanPham = data;
    });
  }
}
