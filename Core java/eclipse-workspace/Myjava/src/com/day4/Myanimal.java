package com.day4;
class Animal{
	void move() {
		System.out.println("All animals willl move");
	}
	void eat() {
		System.out.println("All animals eat something");
	}
}
class Dog extends Animal{
	void move() {
		System.out.println("Dog will move by walking");
	}
	void eat() {
		System.out.println("DOg will eat chicken");
	}
}
public class Myanimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
	}

}
