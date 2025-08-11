package July24;
class First{
	public void show() {
		System.out.println("show of  class First");
	}
}
class Second extends First{
	@Override
	public void show() {
		super.show();
		System.out.println("Show of  class Second");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Second s= new Second();
		s.show();

	}

}
