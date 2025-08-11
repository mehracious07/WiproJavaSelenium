package LabSession01;
//Read back the list of students from the file and display it.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {

	public static void main(String[] args) throws IOException {
		FileReader fw=new FileReader("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\LabSession01\\Sample");
		BufferedReader r=new BufferedReader(fw);
		String data=r.readLine();
		while(data!=null) {
			System.out.println(data);
			data=r.readLine();
		}
r.close();
fw.close();
	}

}
