package July31;

import java.util.*;


class Student implements Comparable<Student>{
    String name;
    int rollno;

    Student(String name,int rollno){
this.name=name;
this.rollno=rollno;
    }

    public int compareTo(Student s){
return this.rollno-s.rollno;
    }
}

public class ComaparableExample {
    public static void main(String[] args) {
        List<Student>l=new ArrayList<>();
l.add(new Student("Sanjay",102));
l.add(new Student("Aman",101));
l.add(new Student("Nitin",103));

Collections.sort(l);

for(Student s: l){
System.out.println(s.name +"->"+s.rollno);
}
    }
}
