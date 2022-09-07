import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer/customer";
import {CustomerService} from "../../service/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customerList: Customer[] = [];
  p: number = 1;

  constructor(private customerService: CustomerService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getAll()
  }

  getAll() {
    this.customerService.getAll().subscribe(data => {
      this.customerList = data;
    })
  }

  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe(()=>{

        this.router.navigateByUrl("/customer-list").then(()=>{
          this.ngOnInit()
        });
    },
      error => {
      console.log(error)
      })
  }

}
