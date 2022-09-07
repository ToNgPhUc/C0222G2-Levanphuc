import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Dish} from '../model/dish';
import {DishType} from '../model/dish-type';
import {DishService} from '../service/dish.service';
import {Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-dish-list',
  templateUrl: './dish-list.component.html',
  styleUrls: ['./dish-list.component.css']
})
export class DishListComponent implements OnInit {

  dishArray: Dish[] = [];
  dishTypeArray: DishType[] = [];

  searchForm: FormGroup;
  totalPages: number;
  countTotalPages: number[];
  number: number;
  size: number;

  constructor(private dishService: DishService, private router: Router,private toast : ToastrService) {

  }

  ngOnInit(): void {
    this.getDishPage(0, '', '', '', '');
    this.createSearchForm();
    this.getAllDishType();
  }

  getAllDishType() {
    this.dishService.getAllDishType().subscribe(data => {
      this.dishTypeArray = data;
      console.log(data);
    });
  }

  searchDish() {
    this.getDishPage(0,
      this.searchForm.value.dishName,
      this.searchForm.value.dishCode,
      this.searchForm.value.dishPrice,
      this.searchForm.value.dishTypeId);
  }

  createSearchForm() {
    this.searchForm = new FormGroup({
      dishName: new FormControl(),
      dishCode: new FormControl(),
      dishPrice: new FormControl(),
      dishTypeId: new FormControl()
    });
  }

  getDishPage(page: number, dishName: string, dishCode: String, dishPrice: string, dishTypeId: string) {
    this.dishService.getDishPage(page, dishName, dishCode, dishPrice, dishTypeId).subscribe((data: Dish[]) => {
      if (data !== null) {
        // @ts-ignore
        this.totalPages = data.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(data.totalPages);
        // @ts-ignore
        this.number = data.number;
        // @ts-ignore
        this.dishArray = data.content;
        // @ts-ignore
        this.size = data.size;
      } else {
        this.dishArray = [];
      }
    }, error => {
      console.log(error);
    });
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getDishPage(numberPage, this.searchForm.value.dishName,
        this.searchForm.value.dishCode,
        this.searchForm.value.dishPrice,
        this.searchForm.value.dishTypeId);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getDishPage(numberPage, this.searchForm.value.dishName,
        this.searchForm.value.dishCode,
        this.searchForm.value.dishPrice,
        this.searchForm.value.dishTypeId);
    }
  }

  goItem(i: number) {
    this.getDishPage(i, this.searchForm.value.dishName,
      this.searchForm.value.dishCode,
      this.searchForm.value.dishPrice,
      this.searchForm.value.dishTypeId);
  }


  deleteDishById(id: number) {
    this.dishService.deleteDishById(id).subscribe(value => {
    }, error => {
    }, () => {
      // @ts-ignore
      $('#exampleModal' + id).modal('hide');
      this.getDishPage(0, this.searchForm.value.dishName,
        this.searchForm.value.dishCode,
        this.searchForm.value.dishPrice,
        this.searchForm.value.dishTypeId);
      this.router.navigateByUrl('/dish').then(next => this.toast.success('Xóa thành công'));
    });
  }

  goStart() {
    this.getDishPage(0, this.searchForm.value.dishName,
      this.searchForm.value.dishCode,
      this.searchForm.value.dishPrice,
      this.searchForm.value.dishTypeId);
  }
  goEnd(){
    this.getDishPage(this.totalPages-1, this.searchForm.value.dishName,
      this.searchForm.value.dishCode,
      this.searchForm.value.dishPrice,
      this.searchForm.value.dishTypeId);
  }

}
