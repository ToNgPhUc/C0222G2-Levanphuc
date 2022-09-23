import {Component, OnInit} from '@angular/core';
import {CartService} from '../../service/cartOder/cart.service';
import {Route, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {CustomerService} from '../../service/customer.service';
import {CommonService} from '../../service/jwt/common.service';
import {Oder} from '../../model/oder';
import {Customer} from '../../model/customer';
import {CookieService} from '../../service/jwt/cookie.service';
import {Subscription} from 'rxjs';
import {render} from 'creditcardpayments/creditCardPayments';

declare var $: any;

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  role: string = '';
  username: string = '';
  token: string = '';
  messageReceived: any;
  private subscriptionName: Subscription;
  public loginStatus: any;
  customer: Customer;
  productOrders: Oder[] = [];
  totalMoney: number = 0;


  constructor(private cookieService: CookieService,
              private customerService: CustomerService,
              private cartService: CartService,
              private toastrService: ToastrService,
              private commonService: CommonService,
              private router: Router
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
      this.getCustomerByUsername(this.username);
    });

  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.sendMessage();
    this.getCustomerByUsername(this.username);
  }

  getProductInCardByCustomer(customer: Customer) {
    this.cartService.getProductInCardByCustomer(customer).subscribe((pos: Oder[]) => {
      if (pos != null) {
        this.productOrders = pos;
        this.caculateTotalMoney(pos);
      } else {
        this.productOrders = [];
      }
    });
  }

  private caculateTotalMoney(pos: Oder[]) {
    this.totalMoney = 0;
    for (let i = 0; i < pos.length; i++) {
      // @ts-ignore
      this.totalMoney += (pos[i].quantity * pos[i].product.price);
    }
    const target = $('#paymentsBtn');
    target.remove('#payments');
    target.html('<div id="payments" *ngIf="totalMoney >= 0"></div>');
    if (this.totalMoney >= 0) {
      render(
        {
          id: '#payments',
          currency: 'USD',
          value: String((this.totalMoney + 5).toFixed(2)),
          onApprove: (details) => {
            console.log(details);
            if (details.status == 'COMPLETED') {
              this.onPaymentSuccess();
            }
          }
        }
      );
    }
  }

  onPaymentSuccess() {
    $('#exampleModalPayment').modal('hide');
    this.router.navigateByUrl('/loading').then(() => {
      this.cartService.goPayment(this.customer).subscribe(() => {
        setTimeout(() => {
          this.router.navigateByUrl('/product-list').then(() => {
            this.toastrService.success('Thanh toán thành công!');
          });
        }, 500);
      });
      this.sendMessage();
    });
  }

  getCustomerByUsername(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      this.customer = value;
      this.getProductInCardByCustomer(value);
    });
  }

  minusQuantity(productOrder: Oder) {
    this.cartService.minusQuantity(productOrder).subscribe(value => {
      this.productOrders = value;
      this.caculateTotalMoney(value);
      this.sendMessage();
    }, error => {
      if (error.error.message == 'minimum') {

      }
    });
  }

  closeModal(id: number) {
    $('#exampleModalCenter' + id).modal('hide');
  }

  plusQuantity(productOrder: Oder) {
    this.cartService.plusQuantity(productOrder).subscribe(value => {
      console.log('value = ' + value);
      this.productOrders = value;
      this.caculateTotalMoney(value);
      this.sendMessage();
    }, error => {
      if (error.error.message == 'maximum') {
        this.toastrService.warning('số lượng sản phẩm này trong shop đã hết');
      }
    });
  }

  maximumQuantity() {
    this.toastrService.warning('số lượng sản phẩm này trong shop đã hết.');
  }

  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }

  deleteProductInCart(po: Oder) {
    this.cartService.deleteProductInCard(po).subscribe((value: Oder[]) => {
      this.productOrders = value;
      this.caculateTotalMoney(value);
      this.toastrService.success('Xóa thành công sản phẩm ' + po.product.name + ' khỏi giỏ hàng.');
      $('#deleteMinusModal' + po.product.id).modal('hide');
      $('#exampleModalDeleteButton' + po.product.id).modal('hide');
      this.sendMessage();
    }, error => {
      if (error.error.message == 'notfound') {
        this.toastrService.warning('Không tìm thấy sản phẩm!');
      }
    });
  }


  //
  // getListCart(page: number) {
  //   this.cartService.findAllOder(page).subscribe((data: Oder[]) => {
  //     console.log(data);
  //     // @ts-ignore
  //     this.totalPages = data.totalPages;
  //     // @ts-ignore
  //     this.countTotalPages = new Array(data.totalPages);
  //     // @ts-ignore
  //     this.number = data.number;
  //     // @ts-ignore
  //     this.cartList = data.content;
  //
  //   });
  // }
  //
  // goPrevious() {
  //   let numberPage: number = this.number;
  //   if (numberPage > 0) {
  //     numberPage--;
  //     this.getListCart(numberPage);
  //   }
  // }
  //
  // goNext() {
  //   let numberPage: number = this.number;
  //   if (numberPage < this.totalPages - 1) {
  //     numberPage++;
  //     this.getListCart(numberPage);
  //   }
  // }
  //
  // goItem(i: number) {
  //   this.getListCart(i);
  // }
  //
  // sendMessage(): void {
  //   this.commonService.sendUpdate('Success!');
  // }

}
