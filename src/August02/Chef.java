package August02;

public class Chef extends Thread {
	String dish;
public Chef(String dish) {
	this.dish=dish;
}

public void run() {
	System.out.println(dish+" Is being Prepared.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
