package unit_2;

import javax.swing.JOptionPane;
import java.util.*;

public class CountWordsUsingScanner {

	public static void main(String[] args) {
		String sent = JOptionPane.showInputDialog("Enter");
		int numWords = 0;
		
		Scanner scStr = new Scanner(sent);
		while(scStr.hasNext()) {
			System.out.println(scStr.next());
			numWords++;
		}
		scStr.close();
		System.out.println("There are " + numWords + " words");
	}
}








