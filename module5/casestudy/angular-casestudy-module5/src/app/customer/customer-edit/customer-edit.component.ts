import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../service/customer.service";
import {CustomerTypeService} from "../../service/customer-type.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerType} from "../../model/customer/customerType";
import {Customer} from "../../model/customer/customer";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})

export class CustomerEditComponent implements OnInit {
  formCustomer: FormGroup;
  id: number
  customer: Customer;

  customerTypeList: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getCustomer(this.id);
    })
  }

  ngOnInit(): void {
    this.getAllCustomerType()

  }

  editCustomer(id: number) {
    const customer = this.formCustomer.value;
    this.customerService.editCustomer(id, customer).subscribe(() => {
        this.router.navigateByUrl('/customer-list').then()
        alert("thành công")
      },
      error => {
        console.log(error)
      });
  }

  private getCustomer(id: number) {
    return this.customerService.findById(id).subscribe(data => {
      this.customer = data;
      this.formCustomer = new FormGroup({
        id: new FormControl(data.id),
        nameCustomer: new FormControl(this.customer.nameCustomer),
        dateOfBirth: new FormControl(this.customer.dateOfBirth),
        gender: new FormControl(this.customer.gender),
        idCard: new FormControl(this.customer.idCard),
        phoneNumber: new FormControl(this.customer.phoneNumber),
        email: new FormControl(this.customer.email),
        address: new FormControl(this.customer.address),
        customerType: new FormControl(this.customer.customerType.name)
      });
    });
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(data => {
      this.customerTypeList = data
    })
  }

}
