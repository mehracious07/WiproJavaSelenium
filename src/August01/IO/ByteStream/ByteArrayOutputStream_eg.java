package IO.ByteStream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_eg {

	public static void main(String[] args) {
		try {
			String data="Hello my name is Sanjay";
			ByteArrayOutputStream outPut= new ByteArrayOutputStream();
			outPut.write(data.getBytes());
			
			byte[]Array=outPut.toByteArray();
			String result=new String(Array);
			System.out.print(result);
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
