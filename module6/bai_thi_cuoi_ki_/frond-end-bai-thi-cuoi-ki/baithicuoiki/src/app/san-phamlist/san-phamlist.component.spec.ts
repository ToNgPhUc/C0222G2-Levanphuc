import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SanPhamlistComponent } from './san-phamlist.component';

describe('SanPhamlistComponent', () => {
  let component: SanPhamlistComponent;
  let fixture: ComponentFixture<SanPhamlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SanPhamlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SanPhamlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
