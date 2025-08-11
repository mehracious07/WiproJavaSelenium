package LabSession31July;

public class Question5 {

	public static void main(String[] args) {
		int num=12345;
		int reverse_no=0;
	while(num!=0) {
		int digit = num%10;
		reverse_no=reverse_no*10+digit;
		num=num/10;
	}
System.out.print(reverse_no);
	}

}
