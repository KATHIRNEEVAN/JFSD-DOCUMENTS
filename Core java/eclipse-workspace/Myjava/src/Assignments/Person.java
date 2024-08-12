package Assignments;

import java.util.Scanner;

public class Person {
	String Name;
	int Age;
	Person(String Name,int Age){
		this.Name = Name;
		this.Age = Age;
	}
	void Display() {
		System.out.println("Person Name : "+Name);
		System.out.println("Person Age : "+Age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		int Age = sc.nextInt();
		Person person1 = new Person(Name,Age);
		person1.Display();
	}

}
