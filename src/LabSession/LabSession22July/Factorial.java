package labSession22July;
import java.util.Scanner;
public class Factorial {
	
	public static int factorial(int num) {
		if(num<=1) {
			return 1;
		}
		return num*factorial(num-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want to calculate!");
		int num=sc.nextInt();
		int val=factorial(num);
		System.out.println("Factorial of " + num +" is :" + val);
		sc.close();
	}

}
