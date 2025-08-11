package Package1;


public class Class1 {
	
	private static String salary="23456";
	private static void DisplaySalary() {
		System.out.println(salary);	
	}
	
	int emoployee_id=123;
	void Display_employee_id() {
		System.out.println("Employee id is :"+salary);	
	}
	
	String Emp_name="Sanjay";
	protected void Display_employee_Name() {
		System.out.println("Employee name is :"+Emp_name);	
	}
	
public void show() {
	System.out.println("Hello this is class 1");
}
	public static void main(String[] args) {
		
Class1 s =  new Class1();
s.show();
	}

}
