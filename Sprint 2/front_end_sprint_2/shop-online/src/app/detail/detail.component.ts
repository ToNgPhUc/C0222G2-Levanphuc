import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {ProductService} from '../service/product/product.service';
import {Product} from '../model/product';
import {Subscription} from 'rxjs';
import {CommonService} from '../service/jwt/common.service';
import {CookieService} from '../service/jwt/cookie.service';
import {Oder} from '../model/oder';
import {ToastrService} from 'ngx-toastr';
import {CartService} from '../service/cartOder/cart.service';
import {CustomerService} from '../service/customer.service';
import {Customer} from '../model/customer';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  customer: Customer;
  product: Product;
  id: number;
  productList: Product[] = [];
  role: string = '';
  username: string = '';
  token: string = '';
  product1: Product;

  private subscriptionName: Subscription;
  messageReceived: any;
  public infoStatus: boolean = true;
  constructor(private activatedRoute: ActivatedRoute,
              private productService: ProductService,
              private commonService :CommonService,
              private cookieService: CookieService,
              private toastrService: ToastrService,
              private cartService: CartService,
              private customerService: CustomerService,


              ) {
    this.activatedRoute.paramMap.subscribe(value => {
      this.id = +value.get('id');
      this.findProductById(this.id);
    });
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
    this.getAllNewProduct()
    this.getCustomerByUsername(this.username)
  }
  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
  }
  getCustomerByUsername(username: string) {
    this.customerService.getCustomerByUserName(username).subscribe(value => {
      console.log(value);
      this.customer = value;
      if (value == null) {
        this.infoStatus = false;
      } else {
        this.infoStatus = value.appUser.status;
      }
    });
  }
  addToCart(product: Product) {

    let oder: Oder = {
      customer: this.customer,
      product: product,
      quantity: 1

    };
    this.cartService.addOrder(oder).subscribe((po: Oder) => {
      console.log(po);
      this.toastrService.success('Thêm thành công sản phẩm ' + po.product.name);
      this.sendMessage();
    }, error => {
      if (error.error.message == 'quantity') {
        this.toastrService.warning('Bạn đã thêm vượt quá số lượng sản phẩm!');
      }
    });
  }

  findProductById(id: number) {
    this.productService.findDetailProductById(id).subscribe(value => {
      this.product = value;
    });
  }

  getAllNewProduct() {
    this.productService.getNewProduct().subscribe(value => {
      console.log(value)
      this.productList = value;

    });
  }

}
