package IO.ByteStream;

import java.io.*;

public class FilterInputStream_Eg {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\IO\\SamleFile");
			@SuppressWarnings("resource")
			BufferedInputStream inputStream = new BufferedInputStream(fis);
			int data =inputStream.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=inputStream.read();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
