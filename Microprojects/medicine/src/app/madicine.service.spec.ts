import { TestBed } from '@angular/core/testing';

import { MadicineService } from './madicine.service';

describe('MadicineService', () => {
  let service: MadicineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MadicineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
