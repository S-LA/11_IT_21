/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package secondlesson;

/**
 * @author kwhil
 */
public class SecondLesson {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		PrintFormat consoleA = new PrintFormat(); 	
		consoleA.line();
		consoleA.mid("HEADER");
		consoleA.mid("INFO");
		consoleA.line();
		PrintFormat consoleB = new PrintFormat(24);
		consoleB.line();

		PrintFormat consoleC = new PrintFormat(12, '#');
		consoleC.line();
		
	}

}
