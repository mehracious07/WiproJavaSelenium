package labSession22July;
import java.util.Scanner;
public class EvenOrNot {
public static void EvenCheck(int num) {
if(num%2==0)System.out.print("Number is even");
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
EvenCheck(num);
sc.close();
	}

}
