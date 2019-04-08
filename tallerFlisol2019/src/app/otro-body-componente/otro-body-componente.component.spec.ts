import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OtroBodyComponenteComponent } from './otro-body-componente.component';

describe('OtroBodyComponenteComponent', () => {
  let component: OtroBodyComponenteComponent;
  let fixture: ComponentFixture<OtroBodyComponenteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OtroBodyComponenteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OtroBodyComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
