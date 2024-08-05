import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HomecomponentComponent } from './homecomponent/homecomponent.component';
import { AboutcomponentComponent } from './aboutcomponent/aboutcomponent.component';

import { RouterModule, Routes } from '@angular/router';
import { CalcService } from './calc.service';



const ROUTER: Routes=[
  {path:'home',component:HomecomponentComponent},
  {path:'contact',component:AboutcomponentComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomecomponentComponent,
    AboutcomponentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
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
