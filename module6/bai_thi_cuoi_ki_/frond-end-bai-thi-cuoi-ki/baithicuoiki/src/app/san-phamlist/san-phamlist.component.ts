import { Component, OnInit } from '@angular/core';
import {SanPhamService} from '../service/san-pham.service';
import {Router} from '@angular/router';
import {SanPham} from '../model/san-pham';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-san-phamlist',
  templateUrl: './san-phamlist.component.html',
  styleUrls: ['./san-phamlist.component.css']
})
export class SanPhamlistComponent implements OnInit {

  sanPhamList: SanPham[] = [];
  p: number = 1;

  constructor(private sanPhamService: SanPhamService,
              private router: Router,private toast : ToastrService) {
  }

  ngOnInit(): void {
    this.getAll()
  }

  getAll() {
    this.sanPhamService.getAll().subscribe(data => {
      this.sanPhamList = data;
    })
  }


  deleteSanPham(id: number) {
    this.sanPhamService.deleteSanPham(id).subscribe(()=>{
        this.router.navigateByUrl("/san-pham-list");
        alert("xóa thành công")
      },
      error => {
        console.log(error)
      })
  }
}
