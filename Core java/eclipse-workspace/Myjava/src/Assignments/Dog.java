package Assignments;
import java.util.*;
public class Dog {
    String DogName;
    String Breed;
    Dog(String DogName,String Breed){
    	this.DogName = DogName;
    	this.Breed = Breed;
    }
    void setName(String name) {
    	this.DogName = name;
    	System.out.println("updated Dog Name : "+DogName);
    	System.out.println("Dog Breed : "+Breed);
    }
    void setBreed(String breed) {
    	this.Breed = breed;
    	System.out.println("Dog Name : "+DogName);
    	System.out.println("updated Dog Breed : "+Breed);
    }
    void Display() {
    	System.out.println("Dog Name : "+DogName);
    	System.out.println("Dog Breed : "+Breed);
    }
	public static void main(String[] args) {
		Dog dog = new Dog("Subramani","German-shepard");
		dog.Display();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		dog.setName(name);
		dog.setBreed("indian");
		

	}

}
