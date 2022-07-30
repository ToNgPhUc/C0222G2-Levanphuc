import { Component, OnInit } from '@angular/core';
import {CustomerType} from "../model/customer/customerType";
import {CustomerTypeService} from "../service/customer-type.service";

@Component({
  selector: 'app-customer-type-list',
  templateUrl: './customer-type-list.component.html',
  styleUrls: ['./customer-type-list.component.css']
})
export class CustomerTypeListComponent implements OnInit {
customerType: CustomerType[]=[];
  constructor(private customerTypeService: CustomerTypeService) { }

  ngOnInit(): void {
    this.getAll();
  }
getAll(){
    this.customerTypeService.getAll().subscribe(data=>{
      this.customerType= data;
    })
}
}
