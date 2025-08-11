package labSession22July;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0;
		int second=1;
		int next=0;
		System.out.print("Enter number till where u want to calculate fibonacci :");
		int num=sc.nextInt();
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(int i=2;i<num;i++) {
			next=first+second;
			System.out.print(next+" ");
            first=second;
            second=next;
	}
		sc.close();
	}
}
