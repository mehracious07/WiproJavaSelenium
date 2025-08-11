package LabSession02082025;

public class Question1 extends Thread {
public void run() {
	System.out.println("Hello,World!");
}
	public static void main(String[] args) {
		Question1 obj =new Question1();
		obj.start();

	}

}
