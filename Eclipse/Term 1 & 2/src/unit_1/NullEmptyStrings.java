package unit_1;

public class NullEmptyStrings {

	public static void main(String[] args) {
		// NULL is a special operator in CS
		
		/* String one; */
		// creates a variable, but no address or object.
		/* String two = ""; */
		// this creates an address and an object in memory, 
		// just the string doesn't have any letters.
		/* String three = null; */
		// null creates an address, but the address does not refer to
		// an object.
		
		/* System.out.println(one);
		System.out.println(two);
		System.out.println(three); */
		
		String str1 = new String("");
		String str2 = null;

		System.out.println(str1.equals(""));
		System.out.println(str1 == "");
		System.out.println(str1 == null);
		System.out.println(str2 == null);
		
		
	}

}















