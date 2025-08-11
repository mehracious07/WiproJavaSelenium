package July22;

public class Opreators {

	public static void main(String[] args) {
		//Unary Operator
		
		int a=5;
		int b=6;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		//Arithmetic Operators
		
		int add=a+b;
		System.out.println(add);
		int sub=b-a;
	    System.out.println(sub);
	    
	    int mul=a*b;
		System.out.println(mul);
	    int div=a/b;
		System.out.println(div);
		
		//Shift operators
		//left shift
		System.out.println(10<<2); //10*2^2
		System.out.println(11<<3); //10*2^3
		
		//right shift
		System.out.println(10>>2); //10/2^3
		System.out.println(20>>3); //20/2^3
		
		
		//Relational Operator(Comparison Operator)
		System.out.println(a<b); 
		System.out.println(a>b); 
		
	    System.out.println(a==b); 
		System.out.println(a!=b); 
		
		System.out.println(a>=b); 
		System.out.println(a<=b); 
		 
		 //Bitwise Operators(&,|,^,~)
		
		int x=5;
		int y=3;
		
		 System.out.println(x&y); 
		 System.out.println(x|y); 
		 System.out.println(x^y); 
		 System.out.println(~x); 
			
		 //Logical Operators(&&,||,!)
		 
		 int p=5;
		 int q=5;
		 System.out.println(p>=q && p>=q); //both condition should be true
		 System.out.println(p>q || p==q); //at least one condition should be true 
		 System.out.println(!(p>q)); 
		 
		 //Assignment operator = , += , -=
		 
		 int k=10;
		 k+=4;
		 System.out.println(k); 
		 k-=4;
		 System.out.println(k);
		 
		 //ternary operator
		 
		 int age = 18;
		 System.out.println(age>=18?"You can drive":"You cannot drive");
	}

}
