package July25;
public interface Interface1 {
abstract void Display();
static void Show() {
	System.out.println("Static Show method of Interface 1");
}
static void Same() {
	System.out.println("Same 1");
}
}
interface Interface2 {
	abstract void Write();
	default void Hello() {
		System.out.println("Helloo......");
	}
	static void Same() {
		System.out.println("Same 2");
	}
}
