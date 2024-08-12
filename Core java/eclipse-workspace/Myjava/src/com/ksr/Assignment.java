package com.ksr;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	int RegisterNo;
	String StudentName;
	int Marks[]= new int[5];
	Student(int RegisterNo,String StudentName) {
		this.RegisterNo = RegisterNo;
		this.StudentName = StudentName;
	}
	void getmarks() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {

			Marks[i]=sc.nextInt();
			
		}
	}
	void displayDetails() {
		int TotMarks=0;
		for(int i=0;i<5;i++) {
			TotMarks+=Marks[i];
		}
		int avgMarks=TotMarks/5;
		String Grade = null;
		if(avgMarks>90) {
			Grade="A";
		}
		else if(avgMarks>80 && avgMarks<90) {
			Grade="B";
		}
		else if(avgMarks>70 && avgMarks<80) {
			Grade="C";
		}
		else if(avgMarks>60 && avgMarks<70) {
			Grade="D";
		}
		System.out.println("Register No : "+RegisterNo);
		System.out.println("Student Name : "+StudentName);
		System.out.println("Total mark is : "+TotMarks);
		System.out.println("Average mark is : "+avgMarks);
		System.out.println("Grade : "+Grade);
		System.out.println("Marks"+Arrays.toString(Marks));
	}
}
public class Assignment {

	public static void main(String[] args) {
		Student myobj = new Student(101,"Naveen");
		myobj.getmarks();
		myobj.displayDetails();
		

	}

}
