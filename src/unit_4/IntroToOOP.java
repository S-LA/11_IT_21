package unit_4;

public class IntroToOOP {
	
	public static int prop = 4; // this is a field
	public static void printer(String input) {
		System.out.println(input);
		// this is a method as its an action.
	}
	public static void main(String[] args) {
		// In Java every thing is an Object.
		// Object Orientated vs. Functional;
		// Functional means we write everything in one
		// "FUNCTION".
		// Java is an OOP so we we either use predefined 
		// objects, like while using the String Class,
		// Math's class, etc.
		// But we can also make our own classes with objects.
		
		// Classes are made up if properties (field), data types.
		// Methods perform an action.
		
		// We can then make new data types creating a new class, 
		// that will allow new objects to be created.
		
		// the object FirstObject needs to instantiated.
		FirstObject line = new FirstObject();
		line.draw();
		line.size = 5;
		line.draw();
		line.pattern = '&';
		line.draw();
		line.draw();	
	}
}








