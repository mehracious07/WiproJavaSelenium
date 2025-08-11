package Package2;

import Package1.Class1;

public class DiffPacNonSub {

    public void DiffNonSubPrint() {
        System.out.println("Different package Non sub class");
    }

    public static void main(String[] args) {
    	DiffPacNonSub d=new DiffPacNonSub();
    	d.DiffNonSubPrint();
    	Class1 c= new Class1();
    	c.show();
//    	c.Display_employee_id() ---you cannot access deault in diff package
//    	c.Display_employee_Name();//protecetd we cannot access in non sub class 
    }
}
