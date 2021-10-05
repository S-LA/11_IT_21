package unit_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InitalAndSurname {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Use the Names.txt to produce a print
		 * out that includes the initial of the first
		 * name a dot (.) and surname.
		 */
		File nameFile = new File("src//unit_2//Names.txt");
		Scanner scan = new Scanner(nameFile);
		
		while(scan.hasNext()) {
			String fullName = scan.nextLine();
			
			Scanner split = new Scanner(fullName);
			
			String first = split.next();
//			String middle = split.next();
			String last = split.next();
			
			char initial = first.charAt(0);
			
			String output = Character.toString(initial) + ". " + last;
			System.out.println(output);
			split.close();
		}	
		scan.close();
	}
}
