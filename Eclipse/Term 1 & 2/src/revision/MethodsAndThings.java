package revision;

public class MethodsAndThings {
	
	public static int num(int hi) {
		int i = hi + 2;
		return i;
	}

	public static void main(String[] args) {
		// static vs non-static 
		// statics work with classes.
		// non-static work with objects.
		
//		System.out.print(num(4));
//		int j = 2;
//		String str = new String("dwududd");
		String str = "Hello this iS a string";
		String sub = str.substring(12);
		System.out.println(sub);
		int ind = str.indexOf("a");
		System.out.println(ind);
		String strOut = "";
		for(int i = 0; i< str.length();i++) {
			char value = str.charAt(i);
			int move = value + 1;
			strOut = Character.toString(move);
		}
		
		System.out.println(strOut);
//		char letter = 'a';
//		char upper = Character.toUpperCase(letter);
//		boolean isupper = Character.isUpperCase(upper);
//		
//		if(letter=='a') {
//			System.out.println("yes");
//		}
//			
	}

}









