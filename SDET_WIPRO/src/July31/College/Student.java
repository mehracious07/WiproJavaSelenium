package College;

public class Student {
	 private String name="Sanjay";
	    private String id="123";
	    private String department="CS";

    
	    public void displayStudentInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student ID: " + id);
	        System.out.println("Department: " + department);
	    }
	public static void main(String[] args) {
		Student ob = new Student(); 
		System.out.println(ob.name);
	}

}
