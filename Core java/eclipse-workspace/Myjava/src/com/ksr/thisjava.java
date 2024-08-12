package com.ksr;
//this keyword refers current class object
public class thisjava {
    String name;
    thisjava(String name){
    	this(10,20);
    	this.name=name;
    	this.display();

    }
    thisjava(int a,int b){
    	System.out.println("Sum : "+(a+b));
    }
    void display() {
    	System.out.println("Welcome "+name);
    }
	public static void main(String[] args) {
		thisjava obj =new thisjava("naveen");
	}

}
