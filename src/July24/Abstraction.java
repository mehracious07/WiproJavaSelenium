package July24;

abstract class Animal{
	abstract void makeSound();
	
	public Animal() {
		System.out.println("My Name is Simba the Lion");
	}
	public void Greet() {
		System.out.println("Good Morning");
	}
	public static String AnimalBehaviour="Sleeping";
	public final String AnimalBreed="Lion";
}
public class Abstraction extends Animal{
	public void makeSound() {
		System.out.println("Rooooooooooooooooooooaaaarssss");
	}
	public static void main(String[] args) {
		Abstraction a=new Abstraction();
		a.makeSound();
		System.out.println(a.AnimalBreed);
		System.out.println(AnimalBehaviour);
		a.Greet();	
	}

}
