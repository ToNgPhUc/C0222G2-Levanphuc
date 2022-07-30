import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerType} from "../model/customer/customerType";
import {CustomerTypeService} from "../service/customer-type.service";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  formCustomer: FormGroup;
  customerTypeList: CustomerType[] = []
  constructor( private customerTypeService: CustomerTypeService) {
  }

  ngOnInit(): void {
    this.formCustomer = new FormGroup({
    nameCustomer: new FormControl("",[Validators.pattern(" "),Validators.required]),
    dateOfBirth: new FormControl("",[Validators.required]),
    idCard: new FormControl("",[Validators.pattern("^([0-9]{9})|([0-9]{12})$"),Validators.required]),
    phoneNumber: new FormControl("",[Validators.required,Validators.pattern("^([0][9][0][0-9]{7})|([0][9][1][0-9]{7})$")]),
    email: new FormControl("",[Validators.email,Validators.required]),
  })
  }

  createCustomer() {
    console.log(this.formCustomer)
  }


  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customerTypeList= data
    })
  }
}
