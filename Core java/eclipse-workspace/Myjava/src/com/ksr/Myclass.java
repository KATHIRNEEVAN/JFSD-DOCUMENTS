package com.ksr;

public class Myclass {
    int b =20;//object need to be created for accessing 
    static int c =30; // no need to create object for accessing
	public static void main(String[] args) {
		int a = 10; // local variable accessible inside this method
		System.out.println("local variable : "+a);
		Myclass obj =  new Myclass();
		System.out.println("object variable : "+obj.b);
		System.out.println("static variable : "+Myclass.c);

	}

}
