package Package1;

public class SamePacSub extends Class1 {
public void printSame() {
	System.out.println("Same package sub class");
}
	public static void main(String[] args) {
		Class1 obj3=new Class1();
		obj3.show();
		SamePacSub obj4=new SamePacSub();
		obj4.printSame();
//		obj4.DisplaySalary(); you cannot access private method;
		obj4.Display_employee_id();//Default
		obj4.Display_employee_Name();//Protected
	}

}
