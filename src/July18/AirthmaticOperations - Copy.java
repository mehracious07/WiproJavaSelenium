
public class AirthmaticOperations {

//	int a=20;
//	int b=10;
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	public void division(int a,int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		int a=20;
		int b=10;
		AirthmaticOperations A = new AirthmaticOperations();
A.multiplication(a,b);
A.division(a,b);
	}

}
