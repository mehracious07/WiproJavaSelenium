package July24;
//Method Overloading
class A{
	public static int  sub(int a,int b) {
		return a-b;
	}
	public static int  sub(int a,int b,int c) {
		return a-b-c;
	}
	public double Add(int a,int b , double s) {
		return a+b+s;
	}
	public int Add(int a,int b,int c) {
		return a+b+c;
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		A a=new A();
		double sum1=a.Add(1, 2,3.1);
		int sum2=a.Add(1,2,3);
		System.out.println(sum1);		
		System.out.println(sum2);
	}

}
