package Assignments;
class Vehicles{
	void drive() {
		System.out.println("Driving vehicle");
	}
}
class Car extends Vehicles{
	void drive() {
		System.out.println("Repairing car");
	}
}
public class overridevehicle {
   public static void main(String[] args) {
	   Vehicles obj1 = new Vehicles();
	   obj1.drive();
	   Vehicles obj = new Car();
	   obj.drive();
   }
}
