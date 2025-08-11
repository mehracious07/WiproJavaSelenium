package LabSession.July18;

//4.Write a Program to Swap Two Variables Using a Third Variable
public class Question4 {

	public static void swap(int a,int b) {
		int c=a;
		 a=b;
	     b=c;
	 	System.out.println("Value of a after Swapping "+a);
		System.out.println("Value of b after Swapping "+b);
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Value of a before Swapping "+a);
		System.out.println("Value of b before Swapping "+b);
		swap(a,b);
		
	}

}
