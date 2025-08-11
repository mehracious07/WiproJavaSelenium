package labSession22July;
import java.util.Scanner;
public class No_Divby_5_Or_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(num%5==0)System.out.println("It is divisible by 5");
		else if(num%11==0)System.out.println("It is divisible by 11");
		sc.close();
	}

}
