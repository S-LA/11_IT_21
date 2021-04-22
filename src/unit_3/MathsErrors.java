package unit_3;

import java.io.File;
import java.util.Scanner;

public class MathsErrors {

	public static void main(String[] args) {
		int denom = 0;
		int numer = 6;
		int answer; 
		try {
			answer = numer/denom;
		} catch (ArithmeticException i) {
			System.out.println("Math Error: " + i);
			answer = -1;
		}

		// checked example.
//		File anohter = new File("src//unit_3//name");
//		Scanner scan = new Scanner(anohter);
		
		
		
		System.out.println(answer);
		
		// There are two types of exceptions
		
		// CHECKED and UNCHECKED
		// checked exceptions -> e.g. FileNotFoundException
		// The compiler expects that we deal with them.
		// So the code will not work if a throw or try-catch
		// is not added.
		
		// unchecked exception -> e.g. Arithmetic Exception
		// We can use the try-catch but its not necessary.
		// Using exception handling will make code more robust.
		
		
		
		
	}

}





