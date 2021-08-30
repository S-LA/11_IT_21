/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package stringarrayproj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kwhil
 */
public class StringArray {

	private String[] strArr = new String[100];
	private int size = 0;

	public StringArray() {
		try {
			//File f = new File("Names.txt");
			String path = "src/stringarrayproj/Names.txt";
			Scanner scFile = new Scanner(new File(path));
			while (scFile.hasNext()) {
				strArr[size] = scFile.nextLine();
				size++;
			}
			scFile.close();

		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
	}

	public String toString() {

		String temp = "";
		for (int i = 0; i < size; i++) {
			temp = temp + strArr[i] + "\n";
		}
		return temp;
	}

	public void selectionSort() {
		for (int i = 0; i < size - 1; i++) {// i is the value we are comparing
			for (int j = i + 1; j < size; j++) {
				if (strArr[i].compareTo(strArr[j]) == 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
	}

	public void bubbleSort() {
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (strArr[j].compareTo(strArr[j + 1]) > 0) {
					String temp = strArr[j];
					strArr[j] = strArr[j + 1];
					strArr[j + 1] = temp;
				}
			}
		}
	}

}
