/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mainpackage;

/**
 *
 * @author kwhil
 */
public class ForLoops {
	public static void mainFive(String[] args) {

		int num = 1;
		for(int i = 0; i < 10;i++){
			num = num + i;
			System.out.println(num) ;
		}	
		System.out.println("-----------");
		String words = "Hello how are you";
		
		int len = words.length();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			String letter = words.charAt(i)+" ";
			System.out.print(letter);
		}
		
	}
	
}
