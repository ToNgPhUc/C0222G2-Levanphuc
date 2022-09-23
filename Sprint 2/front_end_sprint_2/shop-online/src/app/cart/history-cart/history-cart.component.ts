import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product/product.service';
import {CookieService} from '../../service/jwt/cookie.service';
import {CommonService} from '../../service/jwt/common.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {Title} from '@angular/platform-browser';
import {CartService} from '../../service/cartOder/cart.service';
import {CustomerService} from '../../service/customer.service';
import {Oder} from '../../model/oder';
import {Customer} from '../../model/customer';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-history-cart',
  templateUrl: './history-cart.component.html',
  styleUrls: ['./history-cart.component.css']
})
export class HistoryCartComponent implements OnInit {
  totalPages: number;
  countTotalPages: number[];
  number: number;
  size: number;
  role: string = '';
  username: string = '';
  token: string = '';
  historyOderList: Oder[] = [];
  customer: Customer;
  messageReceived: any;
  private subscriptionName: Subscription;

  constructor(private productService: ProductService,
              private cookieService: CookieService,
              private commonService: CommonService,
              private router: Router,
              private toastrService: ToastrService,
              private titer: Title,
              private activatedRoute: ActivatedRoute,
              private cartService: CartService,
              private customerService: CustomerService) {
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

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getHistoryOder(0,this.customer);
    this.getCustomerByUsername(this.username);
  }

  getCustomerByUsername(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      this.customer = value;
      this.getHistoryOder(0,value);
    });
  }

  getHistoryOder(page: number, customer: Customer) {
    this.cartService.historyOder(page ,customer).subscribe(value => {
      console.log(value);
      // @ts-ignore
      this.historyOderList = value.content;

      if (value !== null) {
        // @ts-ignore
        this.totalPages = value.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(value.totalPages);
        // @ts-ignore
        this.number = value.number;
        // @ts-ignore
        this.size = value.size;
        // @ts-ignore
        this.productList = value.content;
      }
      if (this.totalPages == 0) {
        this.toastrService.error('không có dữ liệu');
      }
    });
  }

  goPrevious() {
    let numberPage: number = this.number;
    if (numberPage > 0) {
      numberPage--;
      this.getHistoryOder(numberPage, this.customer);
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getHistoryOder(numberPage, this.customer);
    }
  }

  goItem(i: number) {
    this.getHistoryOder(i, this.customer);
  }

  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }


}
