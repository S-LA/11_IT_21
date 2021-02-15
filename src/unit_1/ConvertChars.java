package unit_1;

import javax.swing.JOptionPane;

public class ConvertChars {

	public static void main(String[] args) {
		char input = JOptionPane.showInputDialog("Input a character").toUpperCase().charAt(0);

while (Character.isLetter(input) || Character.isDigit(input) || Character.isWhitespace(input)) {
			if (Character.isLetter(input)) {
				System.out.println("In uppercase: " + Character.toUpperCase(input));
			} else if (Character.isDigit(input)) {
				int num = Integer.parseInt(input + "");
				double squareRoot = Math.sqrt(num);
				System.out.println("Square root: " + squareRoot);
			} else if (Character.isWhitespace(input)) {
				int unicode = (int) input;
				System.out.println("Unicode Value:" + unicode);
			}

			input = JOptionPane.showInputDialog("Input a character").toUpperCase().charAt(0);

		}
	}

}
