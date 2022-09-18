import { Component } from '@angular/core';
import {CookieService} from './service/jwt/cookie.service';
import {LogoutService} from './service/jwt/logout.service';
import {CommonService} from './service/jwt/common.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'shop-online';
  constructor(private cookieService: CookieService,
              private logoutService: LogoutService,
              private commonService: CommonService) {

  }
  onActivate(event) {
    window.scroll({
      top: 0,
      left: 0,
      behavior: 'smooth'
    });
  }

  sendMessage(): void {
    // send message to subscribers via observable subject
    this.commonService.sendUpdate('Đăng Nhập thành công!');
  }
}


