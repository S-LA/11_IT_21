/*
 * Create a class that will make an array, and fill it with lower case letters of the alphabet.
 * Then use the array and ASCII values to determine what the total sum of all numbers in the alphabet is.
 * -> The array must be a char (It must be filed using a loop not {'a','b','c'.......'z'} but manually inputing
 *    the value.
 * -> You may only use for loops. (Will need to one to fill and one to do calculations.)
 * -> If you get a value of 2847 you are correct.
 *
 */



package practice;

public class Alphabet {

	public static void main(String[] args) {
		int numletters = 26;
		char[] alpha = new char[numletters];
		char start = 'a';
		
		int total = 0;
		for(int i = 0; i < numletters; i++) {
			alpha[i] = start++;
			int num = (int)alpha[i];
			total = total + num;
		}
		System.out.println(alpha);

		System.out.println(total);
		
		

	}

}


