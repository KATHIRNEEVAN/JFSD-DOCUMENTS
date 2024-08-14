package Assignments;
class shape1{
	//final float pi = 3.14f;  
	void getArea(int width,int height) {
		System.out.println("Area of given shape: "+(width*height));
	}
}
class Rectangles extends shape1{
	void getArea(int width,int height) {
		System.out.println("Area of given rectangle: "+(width*height));
	}
	
}
public class Shape {

	public static void main(String[] args) {
		shape1 square = new shape1();
		square.getArea(20,30);
		shape1 rectangle =  new Rectangles();
		rectangle.getArea(50, 10);

	}

}
