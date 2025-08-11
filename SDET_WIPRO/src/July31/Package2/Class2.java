package Package2;

import Package1.Class1;

public class Class2 {
	public void display() {
		System.out.println("Hello this is class 2");
	}
	public static void main(String[] args) {
		Class2 obj = new Class2();
		obj.display();
		Class1 s =  new Class1();
		s.show();
		

	}

}
