import { Component } from '@angular/core';
import { CalcService } from '../calc.service';

@Component({
  selector: 'app-homecomponent',
  templateUrl: './homecomponent.component.html',
  styleUrl: './homecomponent.component.css'
})
export class HomecomponentComponent {
  addition:number;
  subraction:number;
  multiplication:number;
  division:number;
  constructor(private calc:CalcService){
    this.addition=calc.getAddition(20,40);
    this.subraction=calc.getsub(20,5);
    this.multiplication=calc.getmul(20,5);
    this.division=calc.getdiv(20,5);

  }
  

}
