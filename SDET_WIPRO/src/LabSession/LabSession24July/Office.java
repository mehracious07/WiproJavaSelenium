package LabSession24July;

abstract class Employee{
	public String name;
	public String id;
	
	public Employee(String name,String id) {
		this.name=name;
		this.id=id;
	}
	abstract double Calculate_Salary();
	
	   public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	    }
}
class Permanent_Emp extends Employee{
	public double monthlySalary;
	public Permanent_Emp(String name,String id,double monthlySalary) {
		super(name,id); 
		this.monthlySalary=monthlySalary;
	}
	public double Calculate_Salary() {
		return monthlySalary;
	}
}

class Contract_Emp extends Employee{
	public double monthlySalary;
	public Contract_Emp(String name,String id,double monthlySalary) {
		super(name,id); 
		this.monthlySalary=monthlySalary;
	}
	public double Calculate_Salary() {
		return monthlySalary;
	}
}

public class Office {

	public static void main(String[] args) {
		Permanent_Emp emp1=new Permanent_Emp("Sanjay","1234",10000.56);
		Contract_Emp emp2=new Contract_Emp("Rajat","4321",5000.00);
		
		System.out.println(emp1.name);
		System.out.println(emp1.id);
		System.out.println(emp1.Calculate_Salary());
		
		System.out.println(emp2.name);
		System.out.println(emp2.id);
		System.out.println(emp2.Calculate_Salary());
		
	}

}
