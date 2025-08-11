package July23;

public class Reversearray {

	public static void main(String[] args) {
		int array[]={10,20,30,40,50};
		System.out.println("Initial array :");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Reversed array :");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

}
