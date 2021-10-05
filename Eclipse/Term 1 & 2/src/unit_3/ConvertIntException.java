package unit_3;

public class ConvertIntException {

	public static void main(String[] args) {
		// the point of exceptions is to deal with errors and 
		// continue running the code.
		
		// the one method of doing this is to use predefined "throws"
		// this does not allow us to deal with the error.
		// This is why the try{}catch(){} is implemented.
		
		try {	
			String st = "4";
			int num = Integer.parseInt(st);
			System.out.println(num);
		} catch (NumberFormatException n) {
			System.out.println("Can not convert");
			System.out.println("Error: " + n);
		}
		
		
		System.out.println("DONE");
		
	}

}
