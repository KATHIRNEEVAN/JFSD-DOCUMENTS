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
    this.medicine.MName=data.medName;
    this.medicine.MManDate=data.medManDate;
    this.medicine.MExpDate=data.medExpDate;
    this.medicine.MQuantity=data.medQuantity;
    this.medicine.Mprice=data.medprice;

    this.result=this.med.insertmedicine(this.medicine);
    alert(this.result);

  }
 
}
