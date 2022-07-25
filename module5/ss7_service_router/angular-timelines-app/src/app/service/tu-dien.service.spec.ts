import { TestBed } from '@angular/core/testing';

import { TuDienService } from './tu-dien.service';

describe('TuDienService', () => {
  let service: TuDienService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TuDienService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
