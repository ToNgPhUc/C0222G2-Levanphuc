import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {SanPham} from '../../model/san-pham';
import {Router} from '@angular/router';
import {SanPhamService} from '../../service/san-pham.service';
import {LoHangService} from '../../service/lo-hang.service';
import {AngularFireStorage} from '@angular/fire/storage';
import {finalize} from 'rxjs/operators';
import {formatDate} from '@angular/common';
import {LoHang} from '../../model/lo-hang';

@Component({
  selector: 'app-lo-hang-create',
  templateUrl: './lo-hang-create.component.html',
  styleUrls: ['./lo-hang-create.component.css']
})
export class LoHangCreateComponent implements OnInit {
  formLoHang: FormGroup;
  sanPham: SanPham[] = [];
  imgSrc: any;
  selectedImage: any = null;

  constructor(private sanPhamService: SanPhamService,
              private loHangService: LoHangService,
              private router: Router,
              private storage: AngularFireStorage) {
  }

  ngOnInit(): void {
    this.getAllSanPham();

    this.formLoHang = new FormGroup({
      id: new FormControl('', [Validators.required]),

      maLoHang: new FormControl('', [Validators.required, Validators.pattern('^LH-[0-9]{4}$')]),
      sanPham: new FormControl('', [Validators.required]),
      soLuong: new FormControl('', [Validators.required, Validators.min(0)]),
      ngayNhapHang: new FormControl('', [Validators.required]),
      ngaySanXuat: new FormControl('', [Validators.required]),
      ngayHetHan: new FormControl('', [Validators.required]),
      img: new FormControl()
    });

  }

  getAllSanPham() {
    this.sanPhamService.getAll().subscribe(data => {
      this.sanPham = data;
    });
  }

  createLoHang() {
    if (this.selectedImage != null) {
      const nameImg = this.getCurrentDateTime() + this.selectedImage.name;
      const fileRef = this.storage.ref(nameImg);
      this.storage.upload(nameImg, this.selectedImage).snapshotChanges().pipe(
        finalize(() => {
          fileRef.getDownloadURL().subscribe((url) => {
            let loHang: LoHang = this.formLoHang.value;
            loHang.img = url;
            this.loHangService.saveLoHang(loHang).subscribe(value => {
              alert("Thành công!");
              this.router.navigateByUrl("/lo-hang-list")
            });
          });
        })
      ).subscribe();
    }
  }

  showPreview(event: any) {
    this.selectedImage = event.target.files[0];
  }

  private getCurrentDateTime(): string {
    return formatDate(new Date(),'dd-MM-YYY','en-US');
  }
}
