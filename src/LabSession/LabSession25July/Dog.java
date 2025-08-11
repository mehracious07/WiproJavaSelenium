package LabSession25July;

public class Dog implements Animal {
@Override
public void Bark() {
	System.out.println("Dog is barking");
}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Bark();

	}

}
