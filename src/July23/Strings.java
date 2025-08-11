package July23;

public class Strings {

	public static void main(String[] args) {
//		String s1 = "Apple";
//		String s2= new String("Mumbai");
//		System.out.println(s1);
//		System.out.println(s2);
//		//equals
//		System.out.println(s1.equals(s2));
//		
//		//concatenation
//		System.out.println(s1.concat(s2));
//		
//		//substring
//		System.out.println(s1.substring(1));
//		System.out.println(s1.substring(1,3));
//		String last3=s1.substring(s1.length()-3);
//		System.out.println(last3);
//		
//		//contains
//		System.out.println(s1.contains("pp"));
//		
//		//replace
//		System.out.println(s1.replace("pp","gg"));
//		System.out.println(s1.replaceAll(s1,"Delhi"));
//		
//		//isEmpty
//		System.out.println(s1.isEmpty());
//		
//		//endsWith
//		System.out.println(s1.endsWith("ple"));
//		
//		//join
//		String[]s= {"Hello","GoodMoring","Sanjay"};
//		String result=String.join(" ", s);
//		System.out.println(result);
//		
//		System.out.println(String.join(" ", s1,s2)); 
//		
//		//compareTo
//		System.out.println(s1.compareTo(s2));
//		
//		//Split
//		String[]result1=result.split(" ");
//		for(String word:result1) {
//			System.out.println(word);
//		}
//		
		
		
		
		
		//----------------------------------------->
		
		String p1="Core Java";
		String p2="Selenium";
		
		//equals
				System.out.println(p1.equals(p2));
				
				//concatenation
				System.out.println(p1.concat(p2));
				
				//substring
				System.out.println(p1.substring(1));
				System.out.println(p1.substring(1,3));
				String last2=p1.substring(p1.length()-2);
				System.out.println(last2);
				
				//contains
				System.out.println(p1.contains("va"));
				
				//replace
				System.out.println(p1.replace("Ja","Aa"));
				System.out.println(p1.replaceAll(p1,"C++"));
				
				//isEmpty
				System.out.println(p1.isEmpty());
				
				//endsWith
				System.out.println(p1.endsWith("ava"));
				
				//join
				
				System.out.println(String.join(" ", p1,p2)); 
				
				//compareTo
				System.out.println(p1.compareTo(p2));
				
				String friends="Rahul Ravi Sanjay Nitin";
				String[]name=friends.split(" ");
				for(String f:name) {
					System.out.print(f+" ");
				}
				

	}

}
