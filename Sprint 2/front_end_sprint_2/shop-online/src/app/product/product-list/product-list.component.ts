import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product/product.service';
import {ActivatedRoute, Router} from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import {Title} from '@angular/platform-browser';
import {Product} from '../../model/product';
import {TypeProduct} from '../../model/type-product';
import {CookieService} from '../../service/jwt/cookie.service';
import {CommonService} from '../../service/jwt/common.service';
import {Subscription} from 'rxjs';
import {Oder} from '../../model/oder';
import {Customer} from '../../model/customer';
import {Bill} from '../../model/bill';
import {CartService} from '../../service/cartOder/cart.service';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  productList: Product[] = [];
  typeProducts: TypeProduct[] = [];
  totalPages: number;
  countTotalPages: number[];
  number: number;
  size: number;
  role: string = '';
  username: string = '';
  token: string = '';
  messageReceived: any;
  private subscriptionName: Subscription;
  customer: Customer;
  bill: Bill;
  product:Product;
  public infoStatus: boolean = true;
  constructor(private productService: ProductService,
              private cookieService: CookieService,
              private commonService: CommonService,
              private router: Router,
              private toastrService: ToastrService,
              private titer: Title,
              private activatedRoute: ActivatedRoute,
             private cartService: CartService,
              private customerService: CustomerService) {

    this.activatedRoute.paramMap.subscribe(paramMap => {
      // console.log('List: ' + paramMap.get('name'));
      const search= paramMap.get('name');
      this.getProduct(0,search);
    });

    // dùng để phân quyền
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
    this.titer.setTitle('product');
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
    this.getProduct(0, '');
    this.getCustomerByUsername(this.username)
  }

  getProduct(page: number, searchName: string) {
    this.productService.findAllProduct(page, searchName).subscribe((data: Product[]) => {

      if (data !== null) {
        // @ts-ignore
        this.totalPages = data.totalPages;
        // @ts-ignore
        this.countTotalPages = new Array(data.totalPages);
        // @ts-ignore
        this.number = data.number;
        // @ts-ignore
        this.productList = data.content;
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
      this.getProduct(numberPage, '');
    }
  }

  goNext() {
    let numberPage: number = this.number;
    if (numberPage < this.totalPages - 1) {
      numberPage++;
      this.getProduct(numberPage, '');
    }
  }

  goItem(i: number) {
    this.getProduct(i, '');
  }

  sendMessage(): void {
    this.commonService.sendUpdate('Success!');
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
}
