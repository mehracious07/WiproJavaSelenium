package IO.ByteStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_Eg {

	public static void main(String[] args) {
		byte[]array= {1,2,3,4};
		try {
			ByteArrayInputStream input=new ByteArrayInputStream(array);
			int data=input.read();

			while(data!=-1) {
				System.out.print(data);
				data=input.read();
				}
		}catch(Exception e) {
		e.getStackTrace();	
		}

	}

}
