import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PriseEnChargeAccordBctComponent } from './prise-en-charge-accord-bct.component';

describe('PriseEnChargeAccordBctComponent', () => {
  let component: PriseEnChargeAccordBctComponent;
  let fixture: ComponentFixture<PriseEnChargeAccordBctComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PriseEnChargeAccordBctComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PriseEnChargeAccordBctComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
