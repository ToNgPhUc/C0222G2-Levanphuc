import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateSanPhamComponent } from './create-san-pham.component';

describe('CreateSanPhamComponent', () => {
  let component: CreateSanPhamComponent;
  let fixture: ComponentFixture<CreateSanPhamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateSanPhamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateSanPhamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
