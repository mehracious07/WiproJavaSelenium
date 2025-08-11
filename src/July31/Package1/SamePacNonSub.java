package Package1;

public class SamePacNonSub {
public void print() {
	System.out.println("Same package No Sub Class");
}
	public static void main(String[] args) {
		
Class1 obj1=new Class1();
SamePacNonSub  obj2=new SamePacNonSub ();
obj1.show();
obj2.print();
obj1.Display_employee_id();//Default
obj1.Display_employee_Name();//protected

	}

}
