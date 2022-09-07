import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerType} from "../../model/customer/customerType";
import {CustomerTypeService} from "../../service/customer-type.service";
import {CustomerService} from "../../service/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  formCustomer: FormGroup;
  customerTypeList: CustomerType[] = []

  constructor( private customerTypeService: CustomerTypeService,
               private customerService: CustomerService,
               private router: Router) {
  }

  ngOnInit(): void {
    this.formCustomer = new FormGroup({
      id: new FormControl(),
      nameCustomer: new FormControl("",[Validators.pattern(" "),Validators.required]),
      dateOfBirth: new FormControl("",[Validators.required]),
      gender: new FormControl(),
      idCard: new FormControl("",[Validators.pattern("^([0-9]{9})|([0-9]{12})$"),Validators.required]),
      phoneNumber: new FormControl("",[Validators.required,Validators.pattern("^([0][9][0][0-9]{7})|([0][9][1][0-9]{7})$")]),
      address: new FormControl(),
      email: new FormControl("",[Validators.email,Validators.required]),
      customerType:new FormControl(),

    })
    this.getAllCustomerType()

  }

  createCustomer() {
    const customer = this.formCustomer.value;
    this.customerService.saveCustomer(customer).subscribe(()=>{
      this.formCustomer.reset();
      this.router.navigateByUrl("/customer-list").then()
      alert("thành công")
    },
      error => {
      console.log(error)
      })
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customerTypeList= data
    })
  }
}
