package July23;
class A{
	public void DisplayA() {
		System.out.println("This is class A display Method");
	}
}
class B extends A{
	public void DisplayB() {
		System.out.println("This is class B display Method");	
	}
}
class C extends A{
	public void DisplayC() {
		System.out.println("This is class C display Method");	
	}
}

public class Hierarchical  {

	public static void main(String[] args) {
		 C obj =new  C ();
		obj.DisplayC();
		obj.DisplayA();
		
		 B obj1 =new  B ();
			obj1.DisplayB();
			obj1.DisplayA();
		

	}

}
