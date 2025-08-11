package July28;

public class Exception_01 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		try{
			int a =100/0;
			System.out.println(a);
			System.out.println(arr[6]);
		}catch( ArithmeticException e){
		    System.out.println("Arithmetic Exception Occured");
		}catch(IndexOutOfBoundsException e) {
			 System.out.println("Your are accessing the wrong index Occured");
		}
		finally {
			try {
				System.out.println(arr[6]);
//				int a=100/0;
			}catch(IndexOutOfBoundsException e) {
				System.out.println(e.toString());	
			}catch( ArithmeticException e){
			    System.out.println("Arithmetic Exception Occured");
				}
    }
  }
}
