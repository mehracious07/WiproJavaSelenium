package Package2;

import Package1.Class1;

public class DiffPacSubClass extends Class1 {
	public void DiffSubPrint() {
		System.out.println("Different package sub class");
	}

	public static void main(String[] args) {
//		Class1 obj1=new Class1();
//		obj1.show();
		DiffPacSubClass obj2=new DiffPacSubClass();
		obj2.DiffSubPrint();
		obj2.show();
//		obj2.Display_employee_id() --you cannot access in diff package 
		obj2.Display_employee_Name();//protecetd
	}

}
