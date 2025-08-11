package IO.ByteStream;

import java.io.FileInputStream;
public class FileInputExample {

	public static void main(String[] args)  {
		try {
			@SuppressWarnings("resource")
			FileInputStream f= new FileInputStream("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\IO\\SamleFile");
			int data=f.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=f.read();
			}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}

}
