package LabSession.July18;


//3.Create a method void greet(String name) that prints:
//Welcome, <name>!

public class Question3 {

	public void Greet(String name) {
		System.out.println("Welcome "+name+"!");
	}
	
	public static void main(String[] args) {
		Question3 person = new Question3();
		String name ="Sanjay Mehara";
person.Greet(name);
	}

}
