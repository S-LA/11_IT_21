package unit_1;

import javax.swing.JOptionPane;

public class CountLetterDigits {

	public static void main(String[] args) {
		char input = JOptionPane.showInputDialog("Input a character").toUpperCase().charAt(0);

		int countLetter = 0;
		int countDigits = 0; 
		int countOther = 0;
		
		while(input != 'X') {
			if(Character.isLetter(input)) {
				countLetter++;
			}
			else if(Character.isDigit(input)) {
				countDigits++;
			} 
			else {
				countOther++;
			}
			input = JOptionPane.showInputDialog("Input a character").toUpperCase().charAt(0);
			
		}
		System.out.println("The number of letters : " + countLetter);
		System.out.println("              numbers : " + countDigits);
		System.out.println("                other : " + countOther);
		
		
		
	}

}





