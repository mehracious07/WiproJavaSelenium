package July25;

class Employee{
	private String name;
	private int age ;
	private float salary=0.0f;
	
	public void setData(String name,int age,float salary) {
		this.name=name;
		if(salary>0) {
			this.salary=salary;
		}else {
			this.salary=0;
		}
		this.age=age;
	}
	
	public void getData() {
		System.out.println("The name of the Employee is "+this.name+" he is "+this.age+" years old ");
		System.out.println("His Salary is :"+this.salary);
	}
}
public class EMP {

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		e1.setData("Sanjay",20, 10000);
		e2.setData("Rajat",22, 20000);
		e3.setData("Mayank",20, -10000);
		
		e1.getData();
		e2.getData();
		e3.getData();

	}

}
