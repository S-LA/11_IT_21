/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mainpackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kwhil
 */
public class TaskAnswers {
	public static void mainAnswer(String[] args) {
		/**
		 * QUESTION ONE
		 */
		String name = JOptionPane.showInputDialog("Name");
		boolean vowelInitial = false;
		char initLetter = name.charAt(0);

		switch (initLetter){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelInitial = true;
				break;
			default:
				break;
		}	

		System.out.println("name : " + name);
		System.out.println("initL: " + initLetter);
		System.out.println("vInit: " + vowelInitial);

		/**
		 * QUESTION TWO
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
//		String age = scan.next();
		int age = scan.nextInt();
		boolean adult = false;

		if(age > 12){
			adult = true;
		}

		if(adult){
			int count = 0;
			while(count<name.length()){
				System.out.print(name.charAt(count) + " ");
				count++;
			}	
			System.out.println("");
		}

		if(adult == false || vowelInitial==true){
			for (int i = 0; i < name.length(); i++) {
				System.out.println(name.charAt(i));
			}
	
		}	

		if(!adult && !vowelInitial){
			String uppername = name.toUpperCase();
			System.out.println(uppername);
//			System.out.println(name.toUpperCase());
		}
	}
	
}
