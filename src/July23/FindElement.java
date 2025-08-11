package July23;

public class FindElement {
 public static int Find(int arr[],int num) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num)return i;
		}
	return -1;
 }
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int i=Find(arr,20);
System.out.println("The element is present at index :"+i);
	}

}
