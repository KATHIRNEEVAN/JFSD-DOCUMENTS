import { Injectable } from '@angular/core';

@Injectable()
export class CalcService {

  getAddition(a:number,b:number) { 
    return a+b;
   }
   getsub(a:number,b:number) { 
     return a-b;
    }
    getmul(a:number,b:number) { 
     return a*b;
    }
    getdiv(a:number,b:number) { 
     return a/b;
    }
}
