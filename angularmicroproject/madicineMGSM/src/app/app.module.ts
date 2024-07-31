import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InputdivComponent } from './inputdiv/inputdiv.component';
import { DisplayCompComponent } from './display-comp/display-comp.component';

@NgModule({
  declarations: [
    AppComponent,
    InputdivComponent,
    DisplayCompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
