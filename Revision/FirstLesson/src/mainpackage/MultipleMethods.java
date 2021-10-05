/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package mainpackage;

/**
 *
 * @author kwhil
 */
public class MultipleMethods {

	public static void mainTwo(String[] args) {
		System.out.println("starts");
		printHello();

		int getAdd = add(4,5);
		System.out.println(getAdd);
		
		int getTimes = times(4,5);
		System.out.println(getTimes);
	}

	public static void printHello() {
		System.out.println("Hello");
	}

	/**
	 * Will take to values and add them...
	 * @param numOne
	 * @param numTwo
	 * @return
	 */
	public static int add(int numOne, int numTwo) {
		int n1 = numOne;
		int n2 = numTwo;
		int total = n1 + n2;
		System.out.print(n1 + "+" + n2 + "=" );
		return total;
	}
	/**
	 * Multiply values 
	 * @param numOne
	 * @param numTwo
	 * @return 
	 */
	public static int times(int numOne, int numTwo) {
		int n1 = numOne;
		int n2 = numTwo;
		int total = n1 * n2;
		System.out.print(n1 + "*" + n2 + "=" );
		return total;
	}

}
