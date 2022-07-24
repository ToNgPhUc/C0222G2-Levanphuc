import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerUserFacilityComponent } from './customer-user-facility.component';

describe('CustomerUserFacilityComponent', () => {
  let component: CustomerUserFacilityComponent;
  let fixture: ComponentFixture<CustomerUserFacilityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerUserFacilityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerUserFacilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
