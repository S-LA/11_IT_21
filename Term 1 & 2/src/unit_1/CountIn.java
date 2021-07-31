package unit_1;

//import javax.swing.*;

public class CountIn {
	public static void main(String[] args) {

		String sentence = "In the ping i'm going to ink a linkin";
		String lookfor = "in";
		
		
		int len = sentence.length();
		sentence = sentence + " "; // add extra space to for loop to work
		
		int count = 0;
		
		for(int i = 0; i < len ; i++) {
			String twoLetters = sentence.substring(i,i+2); // splits the string into two characters each time.
			boolean hasIn = twoLetters.equalsIgnoreCase(lookfor); // checks if it contains the predefines letter combination
			if (hasIn) {
				count++; // increments the value if there 
				System.out.println(twoLetters + " 1 " + count);
			} else {
				System.out.println(twoLetters + " 0 ");
			}
		}
		System.out.println("The total number of \"" + lookfor +"\" in the string is: " + count);
		
	}
}
