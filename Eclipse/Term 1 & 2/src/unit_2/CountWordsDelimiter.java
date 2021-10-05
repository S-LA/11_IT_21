package unit_2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CountWordsDelimiter {
	public static void main(String[] args) {
		String sent = JOptionPane.showInputDialog("Enter");
		int numWords = 0;
//		int runs = 0;
		Scanner scStr = new Scanner(sent)/*.useDelimiter("#")*/;
		scStr.useDelimiter("@,");
//		scStr.useDelimiter(",");
		while(scStr.hasNext()) {
			System.out.println(scStr.next());
			numWords++;
		}
		scStr.close();
		System.out.println("There are " + numWords + " words");
//		runs++;
		
	}
}








