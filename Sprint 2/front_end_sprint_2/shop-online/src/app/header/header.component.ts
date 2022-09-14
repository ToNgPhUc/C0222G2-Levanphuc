import {Component, OnInit} from '@angular/core';
import {CookieService} from '../service/jwt/cookie.service';
import {Router} from '@angular/router';
import {LogoutService} from '../service/jwt/logout.service';
import {ToastrService} from 'ngx-toastr';
import {CommonService} from '../service/jwt/common.service';
import {Subscription} from 'rxjs';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../service/product/product.service';
import {Product} from '../model/product';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  messageReceived: any;
  selected = false;
  private subscriptionName: Subscription;
  searchForm: FormGroup;
  product: Product[] = [];
  page: number = 0;

  constructor(private cookieService: CookieService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private commonService: CommonService,
              private productService: ProductService
  ) {
    this.role = this.readCookieService('role');
    this.username = this.readCookieService('username');
    this.token = this.readCookieService('jwToken');
    // subscribe to sender component messages
    this.subscriptionName = this.commonService.getUpdate().subscribe(message => {
      this.messageReceived = message;
      this.role = this.readCookieService('role');
      this.username = this.readCookieService('username');
      this.token = this.readCookieService('jwToken');
    });
  }

  ngOnInit(): void {
    this.formSearch();
  }

  /**
   * @date 14/08/2022
   * @author PhuongTd
   * @param key
   */
  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  onLogout() {
    setTimeout(() => {
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
              break;
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
    }, 1000);
    this.router.navigateByUrl('/loading').then(() => {
    });
  }

  ngOnDestroy(): void {
    this.subscriptionName.unsubscribe();
  }

  sendMessage(): void {
    // send message to subscribers via observable subject
    this.commonService.sendUpdate('Đăng Xuất thành công!');
  }

  searchProduct() {
    let nameSearch = this.searchForm.value.searchName;
    if (nameSearch == null) {
      nameSearch = '';
    }
    this.router.navigate(['/product-list/', nameSearch]).then();
      // this.productService.findAllProduct(this.page,nameSearch).subscribe((data)=>{
      //   if (data!= null){
      //     this.router.navigate(['/product-list/', nameSearch]).then();
      //     console.log(data)
      //   }else {
      //     this.toastrService.error("không có dữ liệu")
      //   }
    //
    // });
  }

  formSearch() {
    this.searchForm = new FormGroup({
      searchName: new FormControl()
    });
  }
}
