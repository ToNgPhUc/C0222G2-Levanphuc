import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMonMoiComponent } from './list-mon-moi.component';

describe('ListMonMoiComponent', () => {
  let component: ListMonMoiComponent;
  let fixture: ComponentFixture<ListMonMoiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListMonMoiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListMonMoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
