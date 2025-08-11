package July30_Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Sanjay");
		list.add("Rajat");
		list.add("Sachin");
		list.add("Nitin");
		list.add("Mayank");
		
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf("Sanjay"));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.size());
	    list.set(2,"Sanju");
	    System.out.println(list);
	    list.add("Sanjay");
	    System.out.println(list);
	    System.out.println(list.lastIndexOf("Sanjay"));
	    System.out.println(list.getFirst());
	    System.out.println(list.getLast());
	    System.out.println(list);
	    System.out.println(list.removeFirst());
	    System.out.println(list.removeLast());
	    System.out.println(list);
	    
	    for(String s:list) {
	    	System.out.print(s+" ");
	    }
	    System.out.println("");
	    Iterator<String>it=list.iterator();
	    while(it.hasNext()) {
	    	System.out.print(it.next()+" ");
	    }
	    

	}

}
