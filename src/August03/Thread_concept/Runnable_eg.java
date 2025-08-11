package Thread_concept;

class New{
	
}


class A1 implements Runnable{
	public void run() {
		for(int i =0;i<=50;i++) {
			System.out.println("Hello A");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			};
		}
	}
}
class B1 implements Runnable{
	public void run() {
		for(int i =0;i<=50;i++) {
			System.out.println("Hello this is B");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			};
		}
	}
}
public class Runnable_eg {

	public static void main(String[] args) {
		
		Runnable obj1=new A1();
		Runnable obj2=new B1();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
        t1.start();
        t2.start();

	}

}

