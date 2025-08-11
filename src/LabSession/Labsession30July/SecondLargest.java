package Labsession30July;

import java.util.ArrayList;

public class SecondLargest {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);
		System.out.println(a);
		int largest=0;
		int Second_largest=0;
		for(int num:a) {
			if(num>largest) {
				Second_largest=largest;
				largest=num;
			}else if(num > Second_largest && num < largest) {
				Second_largest=num;
			}
		}
System.out.print(Second_largest);
	}

}
