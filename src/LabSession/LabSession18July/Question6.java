package LabSession.July18;

//Write a program to check whether a number is even or odd

public class Question6 {

	public void  checkEvenOrOdd(int n) {
		if(n%2==0) System.out.println(n+" is Even");
		else System.out.println(n+" is Odd");
	}
	
	public static void main(String[] args) {
	Question6 obj=new Question6();
	int n1 = 4;
	int n2 = 5;
	obj.checkEvenOrOdd(n1);
	obj.checkEvenOrOdd(n2);
	}

}
