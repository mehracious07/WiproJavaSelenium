
public class Methods {

	String EmployeeName="Sanjay";
	int EmployeeId=2697;
	
	public void Display() {
		System.out.println(EmployeeName);
		System.out.println(EmployeeId);
	}
	
	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.Display();
	}

}
