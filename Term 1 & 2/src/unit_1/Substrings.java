package unit_1;

public class Substrings {

	public static void main(String[] args) {
		/* The point of the .substring is to 
		 * split words or sentences up.
		 */
		
		String word = "investigate";
		System.out.println(word.substring(8));
		System.out.println(word.substring(2,5));
		System.out.println(word.substring(2,5));
		String email =  "kurtwhilder@gmail.com";
		System.out.println(email.substring(0,11));
		// we call the .substring() method 
		// OVERLOADED. As it can either have
		// string.substring(start_index);
		// string.substring(start_index, end_index);
		
		//			   0123456789
		String str1 = "The cupboard was bare";
		System.out.println(str1.substring(6, 8));
		
		String str2 = "The dog chased the cat";
		String combined = str1.charAt(0) + str2.substring(4,7);
		System.out.println(combined);
		
		
		
		
		
	}

}







