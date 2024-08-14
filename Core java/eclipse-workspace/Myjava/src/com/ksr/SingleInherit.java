package com.ksr;
// single inheritance

class Twowheeler{
	void noofwheels() {
		System.out.println("its a two wheeler ");
	}
}
class bike extends Twowheeler{
	void brandname(){
		System.out.println("brand is honda");
	}
	
}
public class SingleInherit {

	public static void main(String[] args) {
		bike obj = new bike();
		obj.noofwheels();
		obj.brandname();
		

	}

}
