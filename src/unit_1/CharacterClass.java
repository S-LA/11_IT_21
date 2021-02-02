package unit_1;


public class CharacterClass {

	public static void main(String[] args) {
				
		// lower case data types are primitive data types.
		// int, double, long, char
		char lowerLetter = 'a';
		char upperLetter = Character.toUpperCase(lowerLetter);
		System.out.println(lowerLetter + " " + upperLetter);

		char upperAlpha = 'T';
		char lowerAlpha = Character.toLowerCase(upperAlpha);
		System.out.println(upperAlpha + " " + lowerAlpha);
		
		char symbol = '$';
		System.out.print(Character.toUpperCase(symbol));

		char number = '3';
		System.out.print(Character.toUpperCase(number));
		
		
	}

}
