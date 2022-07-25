import {Component, OnInit} from '@angular/core';
import {Customer} from "../model/customer/customer";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customer: Customer[] = []

  constructor() {
    this.customer.push({
      id: 0,
      nameCustomer: 'lê văn phúc',
      dateOfBirth: '14-02-1995',
      gender: 1,
      idCard: 'abc1234',
      phoneNumber: '0911463781',
      email: 'tongphuc@gmail.com',
      address: 'quảng bình'
    },
      {
      id: 1,
      nameCustomer: 'ronando',
      dateOfBirth: '14-02-1995',
      gender: 2,
      idCard: 'xyz12345',
      phoneNumber: '0123456789',
      email: 'ronando@gmail.com',
      address: 'Tây Ban Nha'
      },
      {
        id: 2,
        nameCustomer: 'messi',
        dateOfBirth: '14-02-1995',
        gender: 1,
        idCard: 'abc1234',
        phoneNumber: '0911463781',
        email: 'messi@gmail.com',
        address: 'Argentina'
      }
    )
  }

  ngOnInit(): void {
  }

}
