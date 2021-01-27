package unit_1;

public class TestCharacter {

	public static void main(String[] args) {
		char input = 'g';
//		System.out.print(input);
		
		// the aim is to develop a little program that will
		// let you know the char does not have a uppercase
		// if it doesn't return "ERROR".
		
		// if the char is a lowercase convert it to upperCase
		// if the char is a uppercase, return "Its already uppercase"
		// if its not lowercase or upppercase (symbol or number) return "ERROR"
		
		if(input < 'z' && input > 'A') {
			System.out.print("Its a letter");
		} else {			
			System.out.print("Its not letter");
		}
//		System.out.print(numberInput);
		

	}

}
