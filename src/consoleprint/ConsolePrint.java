package consoleprint;
/*
 * 	The point of this class is to create a neat printer that will always
 * 	print things either in the centre, left justified or right justified.
 * 	it will only take a string input.
 */
public class ConsolePrint {
	
	private int columnWidth = 0; // this will set the width between lines. 
	private String  border = ""; // the symbol used as the boarder
	
	// this constructor takes 
	public ConsolePrint(int inputColumn, String inputEdge) {
		if(inputColumn%2 == 0) {
			// this if checks if the input value is even if its not its incremented to
			// make it easier to centre data.
			inputColumn++;
		}
		columnWidth = inputColumn;
		border = inputEdge;
	}
	
	public void normal(String inputStr) {
		System.out.print(border + " " + inputStr);// prints the border on the left side
		int len = inputStr.length(); 
		int remaining = columnWidth - 3 - len;
		for(int i = 0; i < remaining;i++) {
			System.out.print(" ");
		}
		System.out.println(border);
	}
	
	
	
	
}
