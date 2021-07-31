package unit_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scFile = new Scanner(new File("src//unit_2//Names.txt"));
		String name;
		while(scFile.hasNext()) {
			name = scFile.nextLine();
			System.out.println(name);
		}
		scFile.close();
	}
}
