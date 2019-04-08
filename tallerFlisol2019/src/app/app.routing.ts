import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders, Component } from '@angular/core';
import { BodyComponenteComponent } from './body-componente/body-componente.component';
import { OtroBodyComponenteComponent } from './otro-body-componente/otro-body-componente.component';

const appRoutes: Routes = [
    {
        path: '', 
        redirectTo: '/inicio', 
        pathMatch: 'full'
    }, {
        path: 'inicio',
        component: BodyComponenteComponent
    },
    {
        path: 'otroInicio',
        component: OtroBodyComponenteComponent
    } 
]

export const appRouting: ModuleWithProviders  = RouterModule.forRoot(appRoutes);