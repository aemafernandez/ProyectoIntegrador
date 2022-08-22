import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoArPrComponent } from './logo-ar-pr.component';

describe('LogoArPrComponent', () => {
  let component: LogoArPrComponent;
  let fixture: ComponentFixture<LogoArPrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoArPrComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoArPrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
