import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BodyComponenteComponent } from './body-componente.component';

describe('BodyComponenteComponent', () => {
  let component: BodyComponenteComponent;
  let fixture: ComponentFixture<BodyComponenteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BodyComponenteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BodyComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
