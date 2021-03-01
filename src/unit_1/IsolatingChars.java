package unit_1;

import javax.swing.JOptionPane;

public class IsolatingChars {
	public static void main(String[] args) {
		String house = "house";
		// 0	1	2	3	4	
		// h    o	u	s	e
		
		System.out.println(house);
		
		int len = house.length();
		
		for(int i = 0; i < len;i++) {
			System.out.println(house.charAt(i));
		}
		
		// write code that will use an 
		// Dialog box to receive a word.
		// then print the first, middle and last letter 
		// if the word has a even number of letters print
		// the middle two letters.
		System.out.println("--------------------");
		String input = JOptionPane.showInputDialog("Input a word");
		int letters = input.length();
		int half = letters/2;
		System.out.println(letters);
		
		if(letters%2==0) {
			String printing =""+
					input.charAt(0) + 
					input.charAt(half-1) + 
					input.charAt(half)+ 
					input.charAt(letters-1);
			
			System.out.println(printing);
		} else {
			String printing =""+input.charAt(0) + input.charAt(half)+ input.charAt(letters-1);
			System.out.println(printing);
		}
		
	}
}











