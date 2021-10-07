/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package secondlesson;

/**
 *
 * @author kwhil
 */
public class PrintingObj {

	/**
	 * FIELDS
	 */
	private int consoleWidth = 16;
	
	private char consoleBorder = '|';
	private int consolePadding = 4;

	/**
	 * CONSTRUCTOR
	 */
	public PrintingObj() {
	}

	public PrintingObj(int w) {
		consoleWidth = w;
	}

	public PrintingObj(int w, char b) {
		consoleWidth = w;
		consoleBorder = b;
	}

	public PrintingObj(int w, char b, int p) {
		consoleWidth = w;
		consoleBorder = b;
		consolePadding = p;
	}

	public final void line() {
		for (int i = 0; i < consoleWidth; i++) {
			System.out.print(consoleBorder);
		}
		System.out.println();
	}

	public void mid(String in) {
		String input = in;
		int len = input.length();

		int whitespace = consoleWidth - 2 - len;
		int wsLeft;
		int wsRight;
		if (whitespace % 2 == 0) {
			wsLeft = whitespace / 2;
			wsRight = wsLeft;
		} else {
			wsLeft = (whitespace / 2);
			wsRight = wsLeft + 1;
		}
		String printout = consoleBorder + "";
		for (int i = 0; i < wsLeft; i++) {
			printout = printout + " ";
		}
		printout = printout + input;
		printout = printout + whiteSpace(wsRight);
		printout = printout + consoleBorder;

		System.out.println(printout);
	}

	public void left(String in) {
		String input = in;
		int len = input.length();
		int whitespace = consoleWidth - 2 - len - consolePadding;
		StringBuilder bob = new StringBuilder();
		bob.append(consoleBorder);
		bob.append(whiteSpace(consolePadding));
		bob.append(input);
		bob.append(whiteSpace(whitespace));
		bob.append(consoleBorder);
		System.out.println(bob.toString());	
	}
	public void right(String in) {
		String input = in;
		int len = input.length();
		int whitespace = consoleWidth - 2 - len - consolePadding;
		StringBuilder bob = new StringBuilder();
		bob.append(consoleBorder);
		bob.append(whiteSpace(whitespace));
		bob.append(input);
		bob.append(whiteSpace(consolePadding));
		bob.append(consoleBorder);
		System.out.println(bob.toString());	
	}

	private String whiteSpace(int spaces) {
		StringBuilder bob = new StringBuilder();
		for (int i = 0; i < spaces; i++) {
			bob.append(" ");
		}
		return bob.toString();

	}

	/**
	 * GETTER (ACCESSOR)
	 */
	public int getConsoleWidth() {
		return consoleWidth;
	}

	public char getConsoleBorder() {
		return consoleBorder;
	}

	public int getConsolePadding() {
		return consolePadding;
	}

	public void setConsoleWidth(int consoleWidth) {
		this.consoleWidth = consoleWidth;
	}

	public void setConsoleBorder(char consoleBorder) {
		this.consoleBorder = consoleBorder;
	}

	public void setConsolePadding(int consolePadding) {
		this.consolePadding = consolePadding;
	}

}
