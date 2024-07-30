import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyAngularproject';
  name: string;
  age : number;
  email : string;
  textcolor:string;
  imgpath:string;

  constructor(){
    this.name="naveen";
    this.age=20;
    this.email="naveenkumarksrct35@gmail.com";
    this.textcolor="red";
    this.imgpath="https://th.bing.com/th/id/OIP.fI6jkw5kEXmh3bIrBno7rwHaHa?w=161&h=180&c=7&r=0&o=5&pid=1.7";
  }
  getaddition(a:number,b:number){
    let sum=a+b;
    return sum;
  }
  clickfun(){
    this.name="kumar";
    this.email="hello123@gmail.com";
    if (this.imgpath=="https://th.bing.com/th/id/OIP.fI6jkw5kEXmh3bIrBno7rwHaHa?w=161&h=180&c=7&r=0&o=5&pid=1.7")
      {this.imgpath="https://th.bing.com/th/id/OIP.cGDDA2mfYkjiIhGaN8gDoAAAAA?w=288&h=180&c=7&r=0&o=5&pid=1.7";}
    else if(this.imgpath=="https://th.bing.com/th/id/OIP.cGDDA2mfYkjiIhGaN8gDoAAAAA?w=288&h=180&c=7&r=0&o=5&pid=1.7"){
      this.imgpath="https://th.bing.com/th/id/OIP.fI6jkw5kEXmh3bIrBno7rwHaHa?w=161&h=180&c=7&r=0&o=5&pid=1.7";
    }
  }
}
