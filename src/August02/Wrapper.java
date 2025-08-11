package August02;

public class Wrapper {

	public static void main(String[] args) {
		int a=50;
//		Integer A=Integer.valueOf(a);
		Integer A =a; // AutoBoxing
		System.out.println("Integer is :"+A);
		
		int a1=A.intValue(); // Unboxing
		System.out.println("int  is :"+a1);
	}

}
