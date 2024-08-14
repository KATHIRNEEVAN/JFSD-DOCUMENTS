package Assignments;
class Dog1{
	void makesound() {
		System.out.println("Bark Bark ...");
	}
}
class Cat extends Dog1{
	void makesound() {
		System.out.println("Meow Meow ...");
	}
}
public class Overrideclass {

	public static void main(String[] args) {
		Dog1 cat = new Cat();
		cat.makesound();

	}

}
