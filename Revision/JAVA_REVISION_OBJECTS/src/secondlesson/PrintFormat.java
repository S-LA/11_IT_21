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
public class PrintFormat {

	/**
	 * FIELDS (SETTINGS)
	 */
	private int consoleWidth = 24;
	private char consoleSymbol = '|';
	private int consolePadding = 2;

	/**
	 * CONSTRUCTORS
	 */
	public PrintFormat() {

	}

	public PrintFormat(int w) {
		if (w % 2 != 0) {
			w++;
		}
		consoleWidth = w;
	}

	public PrintFormat(int w, char s) {
		consoleWidth = w;
		consoleSymbol = s;
	}

	public PrintFormat(int w, char s, int p) {
		consoleWidth = w;
		consoleSymbol = s;
		consolePadding = p;
	}

	/**
	 * METHODS
	 */
	public void line() {
		for (int i = 0; i < consoleWidth; i++) {
			System.out.print(consoleSymbol);
		}
		System.out.println();
	}
	public void line(char sym) {
		for (int i = 0; i < consoleWidth; i++) {
			System.out.print(sym);
		}
		System.out.println();
	}

	public void mid(String input) {
		int len = input.length();
		
		int ws = consoleWidth - 2 - len;
		int wsl;
		int wsr;
		if (len % 2 == 0) {
			wsl = ws / 2;
			wsr = wsl;
		} else {
			wsl = ws/2+1;
			wsr = ws/2;
		}
		StringBuilder bob = new StringBuilder();
		bob.append(consoleSymbol);
		bob.append(whitespace(wsl));
		bob.append(input);
		bob.append(whitespace(wsr));
		bob.append(consoleSymbol);
		System.out.println(bob.toString());	
	}
	
	private String whitespace(int amount){
		String totalws = "";
		for (int i = 0; i < amount; i++) {
			totalws = totalws + " ";
		}
		return totalws;
	}

	/**
	 * GETTERS AND SETTERS
	 */
	public int getConsoleWidth() {
		return consoleWidth;
	}

	public void setConsoleWidth(int cw) {
		this.consoleWidth = cw;
	}

}
