import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Medicine} from './model/Medicine';

@Injectable()
export class MadicineService {
  medicine: Medicine;
  url:string;
  medicinearr:Medicine[];

  constructor(private http:HttpClient) {
    this.url="http://localhost:3004/Medicine";
    this.medicine = new Medicine();
    this.medicinearr=[];
   }

   insertmedicine(info:Medicine){
      this.http.post<Medicine>(this.url,info).subscribe();
      
      return "added new data successfully";
   }
   updateMedicine(info:Medicine){
      this.http.put<Medicine>(this.url+"/"+this.medicine.id,info).subscribe();
      return "Employee details updated";
    }
  
    deleteMedicine(medId:number){
      this.http.delete<Medicine>(this.url+"/"+medId).subscribe();
      return "Employee details deleted";
    }
    findAllMedicine(){
      this.http.get<Medicine[]>(this.url).subscribe(data => this.medicinearr = data);
      return this.medicinearr;
    }
  
    findMedicine(medId : number){
      this.http.get<Medicine>(this.url+"/"+medId).subscribe(data => this.medicine = data)
      return this.medicine;
    }
}
