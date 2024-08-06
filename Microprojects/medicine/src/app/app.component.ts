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
  flag2:boolean;
  result:string;

  constructor(private med:MadicineService){
    this.medicine=new Medicine();
    this.medicinearr=[];
    this.flag=false;
    this.flag2=false;
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
  updateMedicine(data:any){
    this.medicine.id=data.medId;
    this.medicine.MName=data.medName;
    this.medicine.MManDate=data.medManDate;
    this.medicine.MExpDate=data.medExpDate;
    this.medicine.MQuantity=data.medQuantity;
    this.medicine.Mprice=data.medprice;
    
    this.result = this.med.updateMedicine(this.medicine);
    alert(this.result);
  }

  deleteMedicine(data:any){
     
    this.result = this.med.deleteMedicine(data.medId);
    alert(this.result);
  }
  findAllMedicine(){
    this.medicinearr=this.med.findAllMedicine();
    this.flag=true;
  }
  findMedicine(data:any){
    this.medicine = this.med.findMedicine(data.medId);
    this.flag2=true;
    this.result = this.medicine.id+ " " + this.medicine.MName + " " +this.medicine.MManDate+ " " +this.medicine.MExpDate + " "+ this.medicine.MQuantity+" "+this.medicine.Mprice;
  }

 
}
