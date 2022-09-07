import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {LoHang} from '../../model/lo-hang';
import {Router} from '@angular/router';
import {LoHangService} from '../../service/lo-hang.service';

@Component({
  selector: 'app-lo-hang-list',
  templateUrl: './lo-hang-list.component.html',
  styleUrls: ['./lo-hang-list.component.css']
})
export class LoHangListComponent implements OnInit {
  loHangList: LoHang[] = [];
  p: number = 1;
  loHangSeachForm: FormGroup;

  totalPages: number;
  number: number;
  countTotalPages: number[];

  constructor(private loHangService: LoHangService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getAllLoHang("","",0)
    // this.getAll();
    this.formSearch()
  }

  getAllLoHang(searchName:string, NgayNhapHangSearch: string, page: number) {
    this.loHangService.findAllLoHang(searchName,NgayNhapHangSearch, page).subscribe((data: LoHang[]) => {
      // @ts-ignore
      this.totalPages = data.totalPages;
      // @ts-ignore
      this.countTotalPages = new Array(data.totalPages);
      // @ts-ignore
      this.number = data.number;
      // @ts-ignore
      this.loHangList = data.content;
    });
  }



  formSearch() {
    this.loHangSeachForm = new FormGroup({
      searchName: new FormControl(),
      NgayNhapHangSearch: new FormControl(),
      // NgaySanXuatSearch: new FormControl(),
      // NgayHetHanSearch: new FormControl()
    });
  }

  deleteLoHang(id: number) {
    this.loHangService.deleteLoHang(id).subscribe(() => {

        this.router.navigateByUrl("/lo-hang-list").then(() => {
          this.ngOnInit()
        });
      },
      error => {
        console.log(error)
      })
  }
  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getAllLoHang("","",numberPage);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getAllLoHang("","",numberPage);
    }
  }

  goItem(i: number) {
    this.getAllLoHang("","",i);
  }

  searchLoHang() {
    let nameSearch = this.loHangSeachForm.value.searchName;
    if (nameSearch == null) {
      nameSearch = "";
    }
    let NgayNhapHangSearch= this.loHangSeachForm.value.NgayNhapHangSearch;
    if (NgayNhapHangSearch==null){
      NgayNhapHangSearch="";
    }
    this.getAllLoHang(nameSearch,NgayNhapHangSearch, 0);
  }
}
