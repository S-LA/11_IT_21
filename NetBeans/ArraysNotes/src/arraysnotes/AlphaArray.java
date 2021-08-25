/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package arraysnotes;

/**
 *
 * @author kwhil
 */
public class AlphaArray {
	public static void run(){
		// if we dont want to fill the array manually we need
		// to tell the compiler how many elements will be in the array.
		// this is due to Java using native static arrays.
		
		char[] alphabet = new char[26];
		
		char start = 65;
		
		for(int i = 0; i < 26; i++ ){
			alphabet[i]= start++;
		}
		
		for(int i = 0; i < alphabet.length; i++){
			char val = alphabet[i];
			System.out.println(val);
		}
		
		
	}
	
}









