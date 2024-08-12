package com.ksr;

public class Methodjava {
	//Types of java methods 
    void myMethod1() {
    	System.out.println("called by instance or object");
    }
    static void myMethod2() {
    	System.out.println("called by just classname");
    }
	public static void main(String[] args) {
		Methodjava obj = new Methodjava();
		obj.myMethod1();
		Methodjava.myMethod2();

	}

}
