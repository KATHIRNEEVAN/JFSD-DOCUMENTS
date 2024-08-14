package com.ksr;
class A1{
	A1(){
		System.out.println("A1");
	}
	A1(int a){
		System.out.println("A1 "+a);
	}
}
class B1 extends A1{
	B1(){
		super(5);
		System.out.println("B1");
	}
}
public class Constinvoke {
   
	public static void main(String[] hi) {
		B1 b = new  B1();
		
	}

}
