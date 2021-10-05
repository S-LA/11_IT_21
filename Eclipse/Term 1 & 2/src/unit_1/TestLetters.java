package unit_1;

import java.util.Scanner;

public class TestLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a char: ");

		String inputString = scan.nextLine();
		scan.close();
		char inputChar = inputString.charAt(0);

		// then check if the <inputChar> is a letter, if it is not
		// print "ERROR" if it is a letter change the case.
		// Then print>> "You input [inputChar], its not [swoppedCase]
		System.out.println("Input: " + inputString);
		System.out.println("char : " + inputChar);

		// check if more than one letter input
		if (inputString.length() != 1) {
			System.out.println("Exiting system as there is an error");
			System.exit(0);
		}

		char changed = ' ';
		if (Character.isLetter(inputChar)) { // just checks if the char is a letter
			if (Character.isUpperCase(inputChar) == true) {
				changed = Character.toLowerCase(inputChar);
			} else {
				changed = Character.toUpperCase(inputChar);
			}
			System.out.println("You input [" + inputChar + "] it's now [" + changed + "]");
		} else {
			System.out.println("ERROR");
		}
		System.out.print("DONE");

	}

}
