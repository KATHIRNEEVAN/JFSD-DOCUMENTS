import { Component } from '@angular/core';
import { MadicineService } from './madicine.service';
import {Medicine} from './model/Medicine';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'madicineMGSM';
  medicine:Medicine;
  medicinearr:Medicine[];
  flag:boolean;
  result:string;

  constructor(private med:MadicineService){
    this.medicine=new Medicine();
    this.medicinearr=[];
    this.flag=false;
    this.result='';
  }
  insertmed(data:any){
    this.medicine.id=data.medId;
    this.medicine.Name=data.medName;
    this.medicine.ManDate=data.medManDate;
    this.medicine.ExpDate=data.medExpDate;
    this.medicine.Quantity=data.medQuantity;
    this.medicine.price=data.medprice;

    this.result=this.med.insertmedicine(this.medicine);

  }
 
}
