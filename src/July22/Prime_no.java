package July22;

public class Prime_no {

	public boolean check_prime(int num) {
		 if (num <= 1) {
	            return false; 
	        }

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false; 
	            }
	        }

	        return true; 
	}
	
	public static void main(String[] args) {
		Prime_no p=new Prime_no();
		boolean result=p.check_prime(5);
System.out.println(result);
	}

}
