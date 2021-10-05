package unit_2;

import java.io.*;
//import java.util.Scanner;

import javax.swing.*;

public class WritingToFile {

	public static void main(String[] args) throws IOException{
		// We need to import a method to do this.
		// we need to use ERROR EXCEPTIONS
//		File getInfo = new File("src//unit_2//Data.txt");
//		Scanner theInfo = new Scanner(getInfo);
//		String infoStr = theInfo.nextLine();
		
		
		FileWriter toPrint = new FileWriter("src//unit_2//Data.txt", true);
		
		PrintWriter outFile = new PrintWriter(toPrint);
//		outFile.println(infoStr);
		
		String line = JOptionPane.showInputDialog("Enter info:");
		
		while(!line.equals("STOP")) {
			outFile.println(line);
			line = JOptionPane.showInputDialog("More...:");
		}
		outFile.close();
		
		
		
	}

}
