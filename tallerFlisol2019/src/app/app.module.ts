import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BodyComponenteComponent } from './body-componente/body-componente.component';
import { appRouting } from './app.routing';
import { HeadComponenteComponent } from './head-componente/head-componente.component';
import { FooterComponenteComponent } from './footer-componente/footer-componente.component';
import { OtroBodyComponenteComponent } from './otro-body-componente/otro-body-componente.component';


@NgModule({
  declarations: [
    AppComponent,
    BodyComponenteComponent,
    HeadComponenteComponent,
    FooterComponenteComponent,
    OtroBodyComponenteComponent
  ],
  imports: [
    BrowserModule, appRouting
  ],
  providers: [
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
