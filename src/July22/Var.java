package July22;

public class Var {

//	String student_name="Sanjay Mehara";
//	int student_age=15;
	
	String student_name;
	int student_age;
	static int student_id=1234;
	
//	public Var(){
//		student_name="Deault Name ";
//		student_age=90;	
//	}
	
	public Var(String n,int a){
		student_name=n;
		student_age=a;	
	}

	
	public void displayStudentInfo() {
		System.out.println("Student name is :"+student_name);
		System.out.println("Student age :"+student_age);
	}
	
	public static void main(String[] args) {
		
//Var v1=new Var();
Var v1=new Var("Sanjay Singh Mehara",15);
v1.displayStudentInfo();
System.out.println(student_id);
	}

}
