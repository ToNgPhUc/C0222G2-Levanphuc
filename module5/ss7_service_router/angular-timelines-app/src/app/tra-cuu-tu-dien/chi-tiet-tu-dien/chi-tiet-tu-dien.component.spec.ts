import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChiTietTuDienComponent } from './chi-tiet-tu-dien.component';

describe('ChiTietTuDienComponent', () => {
  let component: ChiTietTuDienComponent;
  let fixture: ComponentFixture<ChiTietTuDienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChiTietTuDienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChiTietTuDienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
