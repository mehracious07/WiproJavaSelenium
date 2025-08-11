package LabSession24July;
abstract class shape{
	float length;
	float height;
	float radius;
	
	public shape(float radius) {
		this.radius=radius;
	}
	public shape(float length,int height) {
		this.length=length;
		this.height=height;
	}
	abstract double calculateArea();
}
class Circle extends shape{
	public Circle(int radius) {
		super(radius);
	}
	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}
}
class Rectangle extends shape{
	public Rectangle(int length,int height) {
		super(length, height);
	}

	@Override
	public double calculateArea() {
		return length*height;
	}
	
}

public class Area {

	public static void main(String[] args) {
		Circle c=new Circle(2);
		Rectangle r=new Rectangle(12,12);
		System.out.println("The area of Circle is: "+ c.calculateArea());
		System.out.println("The area of Rectangle is: "+r.calculateArea());
	}

}
