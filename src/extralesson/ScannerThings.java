package extralesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerThings {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner one = new Scanner("Hello#there#this#3").useDelimiter(" ");
		// the scanner is just a "fancy" string
		// and as all data can be parsed to it.
		// default delimiter is " ";
		one.useDelimiter("#");
		String first = one.next();
		String second = one.next();
		String three = one.next();
		int four = one.nextInt();
		System.out.println(first + "\n" + second + "\n" + three + "\n" + four);
		one.close();

		// using a system with scanner
		/*
		 * Scanner getInfo = new Scanner(System.in).useDelimiter(" ");
		 * 
		 * while(getInfo.hasNext()) { String info = getInfo.next();
		 * System.out.println(info); }
		 */

		// using a file, you need to import that file.

		File theFile = new File("src//extralesson//thisfile.txt");
		Scanner fileCheck = new Scanner(theFile);
		
		while (fileCheck.hasNext()) {
			Scanner eachLine = new Scanner(fileCheck.next());
			eachLine.useDelimiter(",");
			String wordz = eachLine.next().toLowerCase();
			int num = eachLine.nextInt();
			int numToPrint = num + 2;
			System.out.println(wordz+ numToPrint);
		}
	}

}
