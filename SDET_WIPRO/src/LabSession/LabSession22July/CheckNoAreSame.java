package labSession22July;
import java.util.Scanner;

public class CheckNoAreSame {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Input first floating-point number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Input second floating-point number: ");
	        double num2 = sc.nextDouble();

	       
	        int n1 = (int)(num1 * 100);
	        int n2 = (int)(num2 * 100);

	        if (n1 == n2) {
	            System.out.println("The numbers are the same up to two decimal places.");
	        } else {
	            System.out.println("The numbers are different.");
	        }

	        sc.close();
	}

}
