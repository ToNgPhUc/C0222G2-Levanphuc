import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {LoginService} from '../../service/login.service';
import {AuthService} from '../../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  activeLogin: any;

  constructor(private loginService: LoginService,
              private authService: AuthService) {
  }

  ngOnInit(): void {
    this.createFormLogin();
  }

  createFormLogin() {
    this.loginForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required])
    });
  }

  login() {
    const username = this.loginForm.value.username;
    const password = this.loginForm.value.password;

this.loginService.login(username,password).subscribe(value => {
  this.authService.islogin(value)
})
  }
}
