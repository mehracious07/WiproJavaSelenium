package July31;

import java.util.*;

class Pro{
    String name;
    int Price;
    Pro( String name,int Price){
        this.name=name;
        this.Price=Price;
    }
}

class ComparePrice implements Comparator<Pro>{
    public int compare(Pro p1,Pro p2){
         return p1.Price-p2.Price;
//        return p1.name.compareTo(p2.name);
    }
}
public class Product_Comparator {
    public static void main(String[]args){  
List<Pro>l=new ArrayList<>();
l.add(new Pro("MuscleBlaze",5000));
l.add(new Pro("GNC",7000));
l.add(new Pro("Bigmuscles",2000));

Collections.sort(l,new ComparePrice());

for(Pro p: l){
    System.out.println(p.name +"->"+p.Price);
}

    }
}
