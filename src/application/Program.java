package application;

import java.util.InputMismatchException;
import java.util.Scanner;

//Estrutura try-catch
//try -> tentar
//catch -> capturar
		

public class Program {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		try {
		String[]  vect = leia.nextLine() .split(" ");
		int position = leia.nextInt();
		System.out.println(vect[position]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position! ");
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		System.out.println("End of program ");
		
				
		
		
		leia.close();
		
		
	}

}
