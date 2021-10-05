package unit_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNamesAndMarks {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scFile = new Scanner(new File("src//unit_2//NamesAndMarks.txt"));
		String line;
		double sum = 0;// adds all percentages
		int count = 0; // count the students
		while(scFile.hasNext()) {
			line = scFile.nextLine();//each line
			Scanner marks = new Scanner(line);
			marks.useDelimiter("#");
			String name = marks.next();
			int percentage = marks.nextInt();
			sum = sum + (double)percentage; 
			count++;
			
			System.out.println(line);
			System.out.println(name);
			System.out.println(percentage + "%");
			System.out.println(sum);
			System.out.println(count);
			marks.close();
			
		}
		scFile.close();
		double ave = sum / (double)count;
		System.out.print("\naverage:" + ave + "%");
		
	}
}







