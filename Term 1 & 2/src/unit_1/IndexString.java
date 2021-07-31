package unit_1;

public class IndexString {

	public static void main(String[] args) {
		/*
		 * The .indexOf method allows us to find a specific
		 * character in a String.
		 */
		
		String suchas = "Hello this is a sentence";
		int posL = suchas.indexOf('l');
		System.out.println(posL);
		
//		int pos = 0;
//		for(int i = 0; i< suchas.length();i++) {
//			if(suchas.charAt(i)=='l') {
//				pos = i;
//				break;
//			}
//		}
//		System.out.println(pos);
		
		/*
		 * CONTAINS METHOD
		 * boolean so it will check if a letter is in a string
		 * and return true or false.
		 * This checks for Strings in the String
		 */
		
		boolean isNthere = suchas.contains("z");
		
		System.out.println("is it?" + isNthere);
		
		
		
		
		
		

	}

}
