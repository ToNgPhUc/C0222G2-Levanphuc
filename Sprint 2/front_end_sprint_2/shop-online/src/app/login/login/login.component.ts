import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators,} from '@angular/forms';
import {LoginService} from '../../service/jwt/login.service';
import {ToastrService} from 'ngx-toastr';
import {CookieService} from '../../service/jwt/cookie.service';
import {Router} from '@angular/router';
import {CommonService} from '../../service/jwt/common.service';
import {AuthService} from '../../service/jwt/auth.service';

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
              private commonService: CommonService,
              private authService: AuthService
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
    });
  }


  onLogin() {
    if (this.loginForm.valid) {
      const username = this.loginForm.value.username;
      const password = this.loginForm.value.password;
      this.loginService.onLogin(username, password).subscribe(value => {
        this.authService.isLogin(value);
        this.router.navigateByUrl('/home').then(()=>{
       this.sendMessage()
        })
      });
    } else {
      this.toastrService.error('không thành công');
    }

  }

  sendMessage() : void{
    this.commonService.sendUpdate("Đăng nhập thành công")
  }
}
