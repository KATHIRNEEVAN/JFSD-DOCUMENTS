import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomecomponentComponent } from './homecomponent/homecomponent.component';
import { AboutcomponentComponent } from './aboutcomponent/aboutcomponent.component';
import { ContactcomponentComponent } from './contactcomponent/contactcomponent.component';

import { CalcService } from './calc.service';
import { RouterModule, Routes } from '@angular/router';



const ROUTER: Routes=[
  {path:'home',component:HomecomponentComponent},
  {path:'contact',component:AboutcomponentComponent},
  {path:'about',component:ContactcomponentComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    HomecomponentComponent,
    AboutcomponentComponent,
    ContactcomponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(ROUTER)
  ],
  providers: [
    provideClientHydration(),
    CalcService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
