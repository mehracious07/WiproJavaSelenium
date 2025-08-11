package July23;
class parent {
	void DisplayA() {
System.out.println("This is class A");
	}
}

class child extends  parent{
	void DisplayB() {
		System.out.println("This is class B");
			}
}
public class SingleInheritance {

	public static void main(String[] args) {
		child obj = new child();
		obj.DisplayA();
		obj.DisplayB();

	}

}
