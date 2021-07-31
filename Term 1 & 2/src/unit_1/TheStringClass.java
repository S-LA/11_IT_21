package unit_1;

public class TheStringClass {

	public static void main(String[] args) {
		/*
		 *  The String class is a sequence of one or more characters.
		 *  Strings use double quotation marks " "
		 *  Java provides the String class that allows us to manipulate text strings.
		 */
		
		// NON-STATIC TYPED METHODS
		// .length()
		String sentence;
		sentence = "The dog chased the cat";
		int len = sentence.length();
		System.out.println("\"" + sentence + "\" is " + len + " characters long");
		
		// .compareTo();
		
		String name1, name2;
		
		name1 = "a";
		name2 = "A";
		
		if(name1.compareTo(name2) < 0) {
			System.out.println(name1 + " "  + name2);
		} else {
			System.out.println(name2 + " " + name1);
		}
		
		int comparison = name1.compareTo(name2);
		System.out.println(comparison);
		
		// .equals()
		
		String one = "word";
		String two = "word";
		
		if(one.equals(two)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		// .equalsIgnoreCase();
		
		
		String three = "WORD";
		String four = "word";
		
		if(three.equalsIgnoreCase(four)) {
			System.out.println("They are equal (despite case)");
		} else {
			System.out.println("They are not equal (despite case)");
		}
		
		
		
		
		
		
		
		
	}

}











