import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerFormDangKi: FormGroup;

  constructor() {
    this.registerFormDangKi = new FormGroup({
      email: new FormControl(),
      password: new FormControl(),
      confirmPassword: new FormControl(),
      country: new FormControl(),
      age: new FormControl(),
      gender: new FormControl(),
      phone: new FormControl()

    });
  }

  ngOnInit(): void {
  }

  // registerWithReactive() {
  //   console.log(this.registerFormReactive);
  //   if (this.registerFormReactive.valid){
  //   }
  // }

}
