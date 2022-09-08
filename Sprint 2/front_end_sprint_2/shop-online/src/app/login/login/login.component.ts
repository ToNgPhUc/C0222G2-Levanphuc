import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators,} from '@angular/forms';
import {LoginService} from '../../service/login.service';
import {ToastrService} from 'ngx-toastr';
import {CookieService} from '../../service/cookie.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  // forgotForm: FormGroup;
  // // messageReceived: any;
  // // private subscriptionName: Subscription;
  // // public activeLogin: boolean = false;
  // // public LoginFailCount: number = 0;
  // // public realTimeSecond: number = 0;
  // // public realTimeMinute: number = 2;

  constructor(private cookieService: CookieService,
              private router: Router,
              private toastrService: ToastrService,
              private loginService: LoginService,
              ) {

    }


  ngOnInit(): void {
    this.createLoginForm();
  }

  createLoginForm() {
    this.loginForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required]),
      stayLogged: new FormControl()
    })
  }


  onLogin() {
    if (this.loginForm.valid){
      const username = this.loginForm.value.username;
      const password = this.loginForm.value.password;
      this.loginService.onLogin(username,password).subscribe(value => {
        console.log(value);
        this.toastrService.success("Đăng nhập thành công")
        this.router.navigateByUrl("/home")
      })
    }else {
      this.toastrService.error("không thành công")
    }

  }
}
