package Company;

public class Emp {
protected String Emp_name="Sanjay";
protected String Emp_id="1234";
protected String Emp_Dept="Department";

protected void Show() {
	System.out.println(Emp_name);
	System.out.println(Emp_id);
	System.out.println(Emp_Dept);
}
	public static void main(String[] args) {
		Emp e = new Emp();
		e.Show();

	}

}
