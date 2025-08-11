package July28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\July28\\file.txt");
			System.out.println("File created sucessfully");
			
			FileWriter w = new FileWriter(f);
			w.write("Sanjay Singh Mehara");
			w.write(" Welcome to file handeling ");
			w.close();
			System.out.println("write operation done");
			
			FileReader fr =new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
			    String  line=sc.nextLine();
				System.out.println(line);
			}
			br.close();
			sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		

	}

}
