package July31;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHash {
    public static void main(String[]args){
        Map<Integer,String>m= new LinkedHashMap<>();
        m.put(2,"Banana");
        m.put(3,"Grappees");
        m.put(1, "Apple");
m.put(4,"Pineapple");//updated
m.put(4,"Peach");
m.put(null,"Oranges");
m.put(null,"Dragon Fruit");
m.put(5,"Apple");
m.put(7,null);

for(Map.Entry<Integer,String>e:m.entrySet()){
    System.out.println("Key :"+e.getKey()+"->"+e.getValue());
}
    }
}
