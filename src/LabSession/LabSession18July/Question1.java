package LabSession.July18;
/*
 * 1.Write a program with a method printDetails(String name, int age, String city) that prints:
 
Name: John
Age: 22
City: Delhi

*/
public class Question1 {

	public void printDetails(String name,int age, String city) {
		System.out.println("The name of the person is :"+name);
		System.out.println("The age of the person is :"+age);
		System.out.println("The city of the person is :"+city);
	}
	
	public static void main(String[] args) {
		
Question1 p1= new Question1();
p1.printDetails("John", 22, "Delhi");
	}

}
