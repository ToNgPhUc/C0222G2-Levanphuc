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
import {Customer} from '../model/customer';
import {Oder} from '../model/oder';
import {CartService} from '../service/cartOder/cart.service';
import {CustomerService} from '../service/customer.service';


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
  productOrders: Oder[] = [];
  countProduct: number = 0;
  customer: Customer;

  constructor(private cookieService: CookieService,
              private toastrService: ToastrService,
              private logoutService: LogoutService,
              private router: Router,
              private commonService: CommonService,
              private productService: ProductService,
              private cartService: CartService,
              private customerService: CustomerService
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
      this.getCustomerByUsername(this.username)
    });
  }

  ngOnInit(): void {
    this.formSearch();
    this.getCustomerByUsername(this.username);
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
    this.router.navigate(['/product-list/', nameSearch]);
  }

  formSearch() {
    this.searchForm = new FormGroup({
      searchName: new FormControl()
    });
  }

  getCustomerByUsername(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      this.customer = value;
      this.getProductInCardByCustomer(value);
    });
  }

  getProductInCardByCustomer(customer: Customer) {
    this.cartService.getProductInCardByCustomer(customer).subscribe((pos: Oder[]) => {
      console.log(pos);
      this.countProduct = 0;
      if (pos != null) {
        this.productOrders = pos;

        for (let i = 0; i < pos.length; i++) {
          this.countProduct += pos[i].quantity;
        }
      } else {
        this.productOrders = [];
      }
    });
  }
}
