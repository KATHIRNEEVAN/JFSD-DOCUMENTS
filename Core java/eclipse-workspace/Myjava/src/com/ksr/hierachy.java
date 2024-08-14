package com.ksr;
// single inheritance
class vehicles{
	void noofengine() {
		System.out.println("i have one vehicle");
	}
}
class Twowheelers extends vehicle{
	void noofwheels() {
		System.out.println("its a two wheeler ");
	}
}
class bikes extends Twowheelers{
	void brandname(){
		System.out.println("brand is honda");
	}
	
}
class Scooty extends Twowheelers{
	void brandname(){
		System.out.println("brand is jupiter");
	}
}
public class hierachy {

	public static void main(String[] args) {
		bike1 obj = new bike1();
		obj.noofengine();
		obj.noofwheels();
		obj.brandname();
		
		Scooty obj1 = new Scooty();
		obj1.noofengine();
		obj1.noofwheels();
		obj1.brandname();
		

	}

}
