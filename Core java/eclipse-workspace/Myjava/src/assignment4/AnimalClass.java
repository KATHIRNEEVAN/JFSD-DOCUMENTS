package assignment4;
class Animal{
	void Sound() {
		System.out.println("every animal will sound different");
	}
}
class Bird extends Animal{
	void Sound() {
		System.out.println("keech keech");
	}
}
class Cat extends Animal{
	void Sound() {
		System.out.println("Meow Meow..");
	}
}
public class AnimalClass {

	public static void main(String[] args) {
		Animal bird = new Bird();
		bird.Sound();
		Animal cat = new Cat();
		cat.Sound();

	}

}
