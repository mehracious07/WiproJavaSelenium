public class Local_variable {

	public void  add() {
		int a=4;
		int b=6;
		int c=a+b;
	
		System.out.println(c);
		System.out.println("Hello");
		
	}
	
	public void  add1() {
//		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Local_variable l = new Local_variable();
		l.add();
	}

}
