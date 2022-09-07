import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditMonMoiComponent } from './edit-mon-moi.component';

describe('EditMonMoiComponent', () => {
  let component: EditMonMoiComponent;
  let fixture: ComponentFixture<EditMonMoiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditMonMoiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditMonMoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
