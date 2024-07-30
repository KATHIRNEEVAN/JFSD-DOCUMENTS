import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InputdivComponent } from './inputdiv.component';

describe('InputdivComponent', () => {
  let component: InputdivComponent;
  let fixture: ComponentFixture<InputdivComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [InputdivComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InputdivComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
