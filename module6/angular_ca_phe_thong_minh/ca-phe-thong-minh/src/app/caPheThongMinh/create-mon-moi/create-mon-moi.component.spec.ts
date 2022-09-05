import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateMonMoiComponent } from './create-mon-moi.component';

describe('CreateMonMoiComponent', () => {
  let component: CreateMonMoiComponent;
  let fixture: ComponentFixture<CreateMonMoiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateMonMoiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateMonMoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
