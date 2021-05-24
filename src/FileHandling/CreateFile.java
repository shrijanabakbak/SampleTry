package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj= new File("C:\\Users\\riyar\\OneDrive\\3rd Sem\\Data Structure and Algorithm\\First_Code\\src\\FileHandling\\filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created:" +myObj.getName());
			}else {
				System.out.println("File already exists.");
			}
			
		}catch(IOException e) {
			System.out.println("An error occoured");
			e.printStackTrace();
		}
	}

}
