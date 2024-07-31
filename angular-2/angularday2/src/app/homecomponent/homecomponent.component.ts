import { Component } from '@angular/core';
import { CalcService } from '../calc.service';

@Component({
  selector: 'app-homecomponent',
  templateUrl: './homecomponent.component.html',
  styleUrl: './homecomponent.component.css'
})
export class HomecomponentComponent {
  add:number;
  sub:number;
  mul:number;
  constructor(private calc:CalcService){
    this.add=calc.getAddition(20,40);
    this.sub=calc.getsub(20,40);
    this.mul=calc.getmul(10,10);
  }

}
