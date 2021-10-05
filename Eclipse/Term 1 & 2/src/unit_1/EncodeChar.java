package unit_1;

import javax.swing.JOptionPane;

public class EncodeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input = JOptionPane.showInputDialog("Input a character").charAt(0);
		int value = input;
//		if(Character.isLowerCase(input)) {
//			value = value - 31;
//		} else {
//			value = value + 33;
//		}
		value++;
		
		char send = (char) value;
		if(Character.isLowerCase(send)) {
			send = Character.toUpperCase(send);
		} else {
			send = Character.toLowerCase(send);
		}
		System.out.print(send);

	}

}
