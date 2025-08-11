package July31;

import java.util.TreeMap;
import java.util.Map;
public class Tree {
    public static void main(String[]args){
Map<Integer,String>m=new TreeMap<>();
m.put(1, "Apple");
m.put(2,"Banana");
m.put(3,"Grappees");
m.put(4,"Pineapple");//updated
m.put(4,"Oranges");
m.put(5,"Apple");
m.put(6,null);
// m.put(7,null); //only one null value 
// m.put(null,"tomatto:");//throwing null point exception
for(Map.Entry<Integer,String>e:m.entrySet()){
    System.out.println(e.getKey()+"->"+e.getValue());

// 1->Apple
// 2->Banana
// 3->Grappees
// 4->Oranges
// 5->Apple

}

    }
}
