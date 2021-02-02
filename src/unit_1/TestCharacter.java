package unit_1;

public class TestCharacter {

	public static void main(String[] args) {
//		System.out.print(input);

		// the aim is to develop a little program that will
		// let you know the char does not have a uppercase
		// if it doesn't return "ERROR".

		// if the char is a lowercase convert it to upperCase
		// if the char is a uppercase, return "Its already uppercase"
		// if its not lowercase or upppercase (symbol or number) return "ERROR"
		char input = '5';

//		if (input < 'z' && input > 'a') {
//			System.out.print(Character.toUpperCase(input));
//		} else if (input < 'Z' && input > 'A') {
//			System.out.print("Its already uppercase");
//		} else {
//			System.out.print("ERROR");
//		}
//		System.out.print(numberInput);
		if (input < 'z' && input > 'a') {
			
			System.out.print(Character.toUpperCase(input));
			
		} 
		else if (input < 'Z' && input > 'A') {
			System.out.print("Its already uppercase");
		} 
		else if (Character.isDigit(input) == true){
			System.out.print("Its a number");
		}
		else {
			System.out.print("ERROR");
		}
	
		

	}

}
