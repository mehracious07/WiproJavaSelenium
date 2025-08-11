package July30_Package;

import java.util.Vector;

public class Vec_tors {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
v.add(10);
v.add(20);
v.add(30);
System.out.println(v);
v.add(1,15);
System.out.println(v);
System.out.println(v.elementAt(2));
v.set(3,25);
System.out.println(v);
System.out.println(v.size());
System.out.println(v.capacity());
System.out.println(v.contains(20));
System.out.println(v.firstElement());
System.out.println(v.lastElement());
System.out.println(v.elementAt(2));

//for(int i:v) {
//	System.out.println(i);
//}
	}

}
