package unit_1;

import javax.swing.JOptionPane;

public class CountWords {
	public static void main(String[] args) {
		// use a dialog box to collect a word.
		// count the amount of words entered
		// when stop is entered print the amount of
		//	words entered until then.
		String inputBox = JOptionPane.showInputDialog("Type a word and press ok");
		int counter = 1;
		
		// !=
		// !true == false
		
//		while (inputBox.equalsIgnoreCase("stop")!= true) {
		while (!inputBox.equalsIgnoreCase("stop")) {
			inputBox = JOptionPane.showInputDialog("Type a word and press ok");
			
			if(inputBox.equalsIgnoreCase("stop")!=true) {
				counter++;
			}
		}
		System.out.println("You entered " + counter + " words");
		
	}

}
