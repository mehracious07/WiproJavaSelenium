package LabSession31July;

public class Question2 {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int largest=0;
		int Second_largest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
             Second_largest=largest;
             largest=arr[i];
			}else if(arr[i]<largest && arr[i]>Second_largest) {
				Second_largest=arr[i];
			}
		}
System.out.print(Second_largest);
	}

}
