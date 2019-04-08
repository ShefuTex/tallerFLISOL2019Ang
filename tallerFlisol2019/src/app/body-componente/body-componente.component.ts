import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-body-componente',
  templateUrl: './body-componente.component.html',
  styleUrls: ['./body-componente.component.css']
})
export class BodyComponenteComponent implements OnInit {

  constructor( private activeRoute: Router) { }

  ngOnInit() {
  }

  voyAOtro(){
    this.activeRoute.navigate(['otroInicio']);
  }

}
