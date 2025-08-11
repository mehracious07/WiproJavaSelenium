package July23;

class Car{
	String brand="Maruti";
	public void start() {
		System.out.println("Car starts");	
	}
}
class SportsCar extends Car{
	public void turbo() {
		System.out.println("Turbo mmode start!!");	
	}	
}

public class OOPS_INHERITANCE_Multilevel extends SportsCar {

	public static void main(String[] args) {
		
		OOPS_INHERITANCE_Multilevel car=new OOPS_INHERITANCE_Multilevel();
		System.out.println(car.brand);
		car.turbo();
		car.start();
	}

}
