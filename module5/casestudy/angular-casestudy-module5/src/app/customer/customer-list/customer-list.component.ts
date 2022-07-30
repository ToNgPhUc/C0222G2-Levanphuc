import {Component, OnInit} from '@angular/core';
import {Customer} from "../model/customer/customer";
import {CustomerService} from "../service/customer.service";
import {CustomerTypeService} from "../service/customer-type.service";
import {CustomerType} from "../model/customer/customerType";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: Customer[] = []


  constructor(private customerService: CustomerService) {

  }

  ngOnInit(): void {
    this.getAll()
  }

  getAll() {
    this.customerService.getAll().subscribe(data => {
      this.customerList = data;
    })
  }

}
