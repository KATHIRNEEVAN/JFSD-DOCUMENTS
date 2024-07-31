import { Component } from '@angular/core';
import { CalcService } from './calc.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularday2';
  sum:number;
  constructor(private calc:CalcService){
    this.sum=calc.getAddition(10,20);
  }
}
