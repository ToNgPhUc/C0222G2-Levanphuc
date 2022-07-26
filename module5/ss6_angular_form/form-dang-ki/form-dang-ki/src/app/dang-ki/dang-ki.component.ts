import {Component, OnInit, Output} from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {EventEmitter} from 'protractor';

@Component({
  selector: 'app-dang-ki',
  templateUrl: './dang-ki.component.html',
  styleUrls: ['./dang-ki.component.css']
})
export class DangKiComponent implements OnInit {
  registerFormDangKi = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
    confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
    country: new FormControl(),
    age: new FormControl('', [Validators.min(18), Validators.required]),
    gender: new FormControl(),
    phone: new FormControl('',[ Validators.pattern('^[+84]{1}[0-9]{11}'), Validators.required])

  });
  constructor() {

  }

  ngOnInit(): void {
  }

  registerWithFormDangKi() {
    console.log(this.registerFormDangKi);
  }
}
