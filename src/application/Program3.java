package application;

//Bloco finally

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner leia = null;
		try {
			leia = new Scanner(file);
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (leia != null) {
				leia.close();
			}
			System.out.println("Finally block executed");
		}

	}

}
