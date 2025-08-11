package July23;

public class GC {
	int id;
public GC(int id) {
	this.id=id; 
}

public void finalize() {
	System.out.println("Object is being destroyed");
}
	public static void main(String[] args) {
		GC obj1 = new GC(1);
		GC obj2 = new GC(2);
		
         //by assigning null to objects
		
//		obj1=null;
//		obj2=null;

		//by giving reference of one object to another object
		obj1=obj2;
		
//		Runtime.getRuntime().gc()
		System.gc();
	}

}
