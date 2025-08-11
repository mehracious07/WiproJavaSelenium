package July25;

public class Interface_Class implements Interface1, Interface2 {
	@Override
	public void Display() {
		System.out.println("Displayinggg......");
	}
	@Override
	public void Write() {
		System.out.println("Writinggggg......");		
}
public void Same() {
	System.out.println("Same 3...........");
}
	public static void main(String[] args) {
		Interface_Class ic = new Interface_Class();
		ic .Display();
		ic.Write();
		ic.Hello();
		Interface1.Show();
		Interface1.Same();
		Interface2.Same();
		ic.Same();
	}

}
