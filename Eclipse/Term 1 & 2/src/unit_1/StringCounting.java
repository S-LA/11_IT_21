package unit_1;

import javax.swing.JOptionPane;

public class StringCounting {
	public static void main(String[] args) {
		// take an input sentence from a dialog box and 
		// count the amount of letters (excluding spaces in the 
		// sentence)
		
		String input = JOptionPane.showInputDialog("Type a sentence");
		int len = input.length();
		System.out.println(len);
		int counter = 0;
		
		for(int i = 0;i < len ; i++) {
			if(input.charAt(i)!=' ') {
				counter++;
			} 
		}
		System.out.println("There are " + counter + " letters in that blabla");
		
	}
}











