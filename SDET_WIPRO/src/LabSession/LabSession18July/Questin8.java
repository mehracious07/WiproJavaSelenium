package LabSession.July18;

//Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;
public class Questin8 {

	public static void Divisilblity(int n) {
		if(n%5==0)System.out.println("Number "+n+" is divisible by 5");
		else if (n%11==0)System.out.println("Number "+n+" is divisible by 11");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		Divisilblity(n);
	sc.close();
	}

}
