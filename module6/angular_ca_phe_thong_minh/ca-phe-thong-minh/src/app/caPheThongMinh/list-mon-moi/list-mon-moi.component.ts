import {Component, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {Dish} from '../../model/dish';
import {DishService} from '../../service/dish.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-list-mon-moi',
  templateUrl: './list-mon-moi.component.html',
  styleUrls: ['./list-mon-moi.component.css']
})
export class ListMonMoiComponent implements OnInit {
  dishList: Dish[] = [];

  constructor(private dishService: DishService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getAll()
  }

  getAll() {
    this.dishService.getAll().subscribe(data => {
      console.log(data);
      this.dishList = data;
    });
  }
}
