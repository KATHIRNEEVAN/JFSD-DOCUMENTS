package assignment4;
class Shape{
	int width;
	int height;
	Shape(int w,int h){
		this.width = w;
		this.height = h;
	}
	void CalcArea() {
		System.out.println("Area : "+(width*height));
	}
}
class Circle extends Shape{
    int width;
    int height;
	Circle(int w,int h){
		super(w,h);
		this.width = w;
		this.height = h;
	}
	void CalcArea() {
		System.out.println("Circle Area : "+(width*height));
	}
}
class Rectangle extends Shape{
	 int width;
	 int height;
	Rectangle(int w,int h){
		super(w,h);
		this.width = w;
		this.height = h;
	}
	void CalcArea() {
		System.out.println("Rectangle Area : "+(width*height));
	}
}
class Triangle extends Shape{
	 int width;
	 int height;
	Triangle(int w,int h){
		super(w,h);
		this.width = w;
		this.height = h;
	}
	void CalcArea() {
		System.out.println("Triangle Area : "+(width*height));
	}
}
public class ShapeArea {

	public static void main(String[] args) {
		

	}

}
