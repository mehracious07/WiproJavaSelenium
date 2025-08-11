package LabSession25July;
interface Shape{
	void getArea();
}
class Rectangle implements Shape {
	int length;
	int Breadth;
	public Rectangle(int length,int Breadth) {
		this.length=length;
		this.Breadth=Breadth;
	}
	@Override
	public void getArea() {
		
		System.out.println("Area for rectangle is :"+ this.length*this.Breadth);
	}
}
class Circle implements Shape {
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public void getArea() {
		
		System.out.println("Area for circle is :"+ 3.14*radius*radius);
	}
}
class Triangle implements Shape {
	int base ;
	int height;
	
	public Triangle(int base,int height) {
this.base=base;
this.height=height;
	}
	
	@Override
	public void getArea() {
		
		System.out.println("Area for triangle is :" + 0.5*base*height);
	}
}


