import {Component, OnInit} from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {CookieService} from '../../service/jwt/cookie.service';
import {Subscription} from 'rxjs';
import {CommonService} from '../../service/jwt/common.service';

@Component({
  selector: 'app-personal-information',
  templateUrl: './personal-information.component.html',
  styleUrls: ['./personal-information.component.css']
})
export class PersonalInformationComponent implements OnInit {

  role: string = '';
  token: string = '';
  username: string = '';
  private subscriptionName: Subscription;
  messageReceived: any;
  customer: Customer;
  public infoStatus: boolean = true;

  constructor(private customerService: CustomerService,
              private cookieService: CookieService,
              private commonService: CommonService) {
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
    this.getCustomerByUsername(this.username)
  }

  readCookieService(key: string): string {
    return this.cookieService.getCookie(key);
  }

  ngOnInit(): void {
this.getCustomerByUsername(this.username)
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
