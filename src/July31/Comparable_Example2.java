package July31;

import java.util.*;
class Employee implements Comparable<Employee>{
    String name;
    int Age;
    Employee(String name,int Age){
this.name=name;
this.Age=Age;
    } 

    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
    }
}
public class Comparable_Example2 {
    public static void main(String[]args){
  List<Employee>l=new ArrayList<>();
l.add(new Employee("Sanjay",32));
l.add(new Employee("Aman",33));
l.add(new Employee("Nitin",20));

Collections.sort(l);


for(Employee e:l){
System.out.println(e.name +"->"+e.Age);
}
    }
}
