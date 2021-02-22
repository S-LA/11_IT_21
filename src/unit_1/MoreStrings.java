package unit_1;

public class MoreStrings {

	public static void main(String[] args) {
		/*
		 *  Declaring and instantiating Strings
		 *  
		 *  We have used the short easy way of declaring strings
		 *  this makes them similar to primitive data types.
		 *  
		 *  But there is a more correct way to use Strings,
		 *  by declaring them as objects.
		 */
		
		String name1 = "Sam";
		// this is the primitive type way of declaring/
		String name2 = new String("Jane");
		// where this used the new operator, thus making an object.
		// name2 is now the address that references an object in memory which is 
		// a String.
		
		/* DECLARATION */
		String name3; 
		// we are going to use a variable named string but it does not refer to 
		// anything yet.
		
		/* INSTANTIATION */
		name3 = new String("Jeff");
		// places a new object in memory that is related to the name3.
		
		/* Why we can't use == and must use .equals */
		String name4 = new String("Sam");
		String name5 = new String("Sam");
		
		if(name4 == name5) {
			System.out.println("They are the same");
		} else {
			System.out.println("They are not the same");
		}
		// this compared the memory locations so they are not the same
		// as they are stored in different places.
		if(name4.equals(name5)) {
			System.out.println("They are the same");
		} else {
			System.out.println("They are not the same");
		}
		// this if compared the actual letters in the string and so
		// in this case they are the same.
		
		String name6 = "Sam";
		String name7 = "Ham";
		
		if(name6 == name7) {
			System.out.println("They are all Sam");
		} else {
			System.out.println("They are not Sam");
		}
		// both name6 and name7 are address that refer to the 
		// pool of memory, they will search 
		
		
		
		
	}

}





























