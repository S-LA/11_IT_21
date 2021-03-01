package unit_1;

import javax.swing.JOptionPane;

public class SwopChars {
	public static void main(String[] args) {
		String inputOne = JOptionPane.showInputDialog("First Word");
		String inputTwo  = JOptionPane.showInputDialog("Second Word");
		
		String frontOne = Character.toString(inputTwo.charAt(0));
		String frontTwo = Character.toString(inputOne.charAt(0));
		
		String backOne = inputOne.substring(1);
		String backTwo = inputTwo.substring(1);
				
		String editOne = frontOne + backOne;
		String editTwo = frontTwo + backTwo;
		
		System.out.println(editOne);
		System.out.println(editTwo);
	}
}
