package July22;

public class ReturnMethod {

	public int add(int a,int b) {
		return a+b;
	}
	
public static void main(String[] args) {
ReturnMethod r = new ReturnMethod();
int result=r.add(5,5);
System.out.println(result);
	}

}
