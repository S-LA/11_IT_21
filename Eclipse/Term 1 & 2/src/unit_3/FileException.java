package unit_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileException {

	public static void main(String[] args) {
		
		String filename  = JOptionPane.showInputDialog("Which File?");
		String path = "src//unit_3//textfiles//";
		String fullpath = path + filename + ".txt";
		
		try {
			Scanner scan = new Scanner(new File(fullpath));
			while(scan.hasNext()) {
				try {
					int value = scan.nextInt();
					System.out.println("\t" + value);					
				} catch (InputMismatchException i) { 
					String value = scan.next();
					System.out.println(value);	
//					System.out.println("not an int");	
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
		
	}

}
