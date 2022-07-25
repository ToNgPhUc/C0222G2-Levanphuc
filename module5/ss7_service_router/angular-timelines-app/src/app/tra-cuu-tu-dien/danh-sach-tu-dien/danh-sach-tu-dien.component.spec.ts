import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DanhSachTuDienComponent } from './danh-sach-tu-dien.component';

describe('DanhSachTuDienComponent', () => {
  let component: DanhSachTuDienComponent;
  let fixture: ComponentFixture<DanhSachTuDienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DanhSachTuDienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DanhSachTuDienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
