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
      return "added new data successfully"
   }
}
