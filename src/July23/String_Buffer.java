package July23;

public class String_Buffer {

	public static void main(String[] args) {
		
		  StringBuffer sb = new StringBuffer("Hello");

	        sb.append(" World");
	        System.out.println(sb); 

	        sb.insert(5, ",");
	        System.out.println(sb); 

	        sb.reverse();
	        System.out.println(sb); 
		
	        System.out.println(sb.isEmpty()); 
	        
	        sb.delete(0, 6);
	        System.out.println(sb); 
	        
	        System.out.println(sb.indexOf("H"));
	        System.out.println(sb.charAt(5));
	        
	        System.out.println( sb.replace(2, 4, "ii")); 
	        
	        System.out.println(sb.length());
	        
	      

	}

}
