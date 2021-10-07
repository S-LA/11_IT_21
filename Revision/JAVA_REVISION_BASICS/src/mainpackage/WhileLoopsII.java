/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mainpackage;

import java.util.Scanner;

/**
 *
 * @author kwhil
 */
public class WhileLoopsII {
	public static void mainSeven(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;

		String input = scan.next();

		while(!input.equals("stop")){
			total = total + Integer.parseInt(input);
			System.out.println(total);
			input = scan.next();
		}
		
	}
	
}
