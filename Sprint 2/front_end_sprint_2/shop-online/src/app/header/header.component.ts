import { Component, OnInit } from '@angular/core';
import {CookieService} from '../service/cookie.service';
import {Router} from '@angular/router';
import {LogoutService} from '../service/logout.service';
import {ToastrService} from 'ngx-toastr';
import {CommonService} from '../service/common.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  constructor(private cookieService: CookieService,

              private logoutService: LogoutService,
              private router: Router,
              private toastrService: ToastrService,
              private commonService: CommonService,
              // private notificationService: NotificationService
  ) { }

  ngOnInit(): void {
  }

  onLogout() {
    setTimeout(()=> {
      if (this.cookieService.getCookie('jwToken') != null) {
        this.logoutService.onLogout(this.cookieService.getCookie('jwToken')).subscribe(() => {
          this.cookieService.deleteAllCookies();
          this.cookieService.removeAllCookies();
        }, error => {
          switch (error.error) {
            case 'isLogout':
              this.toastrService.warning('Bạn chưa đăng nhập!');
              break;
            case 'LoginExpired':
              this.cookieService.deleteAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
              break;
            default:
              this.cookieService.deleteAllCookies();
              this.cookieService.removeAllCookies();
              this.router.navigateByUrl('/login').then(() => {
                this.toastrService.warning('Hết phiên đăng nhập vui lòng đăng nhập lại!');
                this.sendMessage();
              });
          //     break;
          }
        }, () => {
          this.router.navigateByUrl('/login').then(() => {
            this.toastrService.success('Đăng xuất thành công!');
            this.sendMessage();
          });
        });
      } else {
        this.toastrService.warning('Bạn chưa đăng nhập!');
      }
    }, 1000)
    this.router.navigateByUrl("/loading").then(() => {
    })
  }
  sendMessage(): void {
    // send message to subscribers via observable subject
    this.commonService.sendUpdate('Đăng Xuất thành công!');
  }
}
