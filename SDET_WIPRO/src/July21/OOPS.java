package July21;


class Fruit{
	String name1;
	String color;
	int price;
	
	public Fruit(String name1,String color,int price) {
		this.name1=name1;
		this.color=color;
		this.price=price;
	}
}

class Person extends Fruit{
	String name2;
	char sex;
	
	  public Person(String name2, char sex, String fruitName, String color, int price) {
	        super(fruitName, color, price);  // call to superclass constructor
	        this.name2 = name2;
	        this.sex = sex;
}
}

public class OOPS {

	public static void main(String[] args) {
//		Fruit F = new Fruit("Mango","Yellow",200);
//		System.out.println(F.color);
//		System.out.println(F.price);
		
		Person p1 = new Person("Sanjay", 'M', "Mango", "Yellow", 200);
		System.out.println("Boy named "+p1.name2+" who is "+p1.sex+" Purchased "+p1.name1+" from market for rupees "+p1.price);
	}
}
