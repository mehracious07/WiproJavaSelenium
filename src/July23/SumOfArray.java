package July23;

public class SumOfArray {

	public static void main(String[] args) {
		int array[]={10,20,30,40,50};
		int sum=0;
		System.out.println("Initial array :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("The sum of array is :"+sum);

	}

}
