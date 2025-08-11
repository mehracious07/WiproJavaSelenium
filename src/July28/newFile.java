package July28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class newFile {

	public static void main(String[] args) {
		try {
			File file = new File("file2.txt");
			System.out.println("File is created");
			FileWriter w = new FileWriter(file);
			w.write("Hello my name is rohit");
			w.close();
			
			FileReader r = new FileReader(file);
			BufferedReader bf=new BufferedReader(r);
			
			Scanner sc = new Scanner(bf);
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			bf.close();
			sc.close();
		}catch(Exception e) {
			System.out.println("Exception occured");
		}

	}

}
