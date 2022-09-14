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

  constructor(private productService: ProductService,
              private cookieService: CookieService,
              private commonService: CommonService,
              private router: Router,
              private toastrService: ToastrService,
              private titer: Title,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(paramMap => {
      console.log('List: ' + paramMap.get('name'));
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
      if (this.totalPages = 0) {
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


}
