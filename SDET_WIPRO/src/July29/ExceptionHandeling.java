package July29;

public class ExceptionHandeling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
//		int a=100;
//		int c =a/0;	
//		System.out.println(c);
//			int arr[]=new int[5];
//			System.out.println(arr[5]);	
			
			String s1 = null;
			System.out.println(s1.length());
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());		
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());		
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());		
		}finally {
			System.out.println("Finally block contains code that always runs after the try");
		}


	}

}
