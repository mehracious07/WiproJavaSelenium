package LabSession24July;
abstract class Vehicle{
	abstract void move();
}
class Car extends Vehicle{
	@Override
	public void move() {
		System.out.println("The Car is moving");
	}
	
}
class Bike extends Vehicle{
	@Override
	public void move() {
		System.out.println("The Bike is moving");
	}
}
class Bus extends Vehicle{
	@Override
	public void move() {
		System.out.println("The Bus is moving");
	}
}

public class Vaahan {

	public static void main(String[] args) {
		Car c=new Car();
		Bus b=new Bus();
		Bike bik=new Bike();
		c.move();
		b.move();
		bik.move();
	}

}
