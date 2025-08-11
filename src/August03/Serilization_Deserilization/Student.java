package Serilization_Deserilization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	int age;
	String name;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}

}
