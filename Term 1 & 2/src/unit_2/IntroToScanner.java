package unit_2;
import java.util.*;

public class IntroToScanner {
	public static void main(String[] args) {
		// the Scanner class is used to
		// perform functions such as 
		// splitting string and reading data.
		// > to use Scanner we need to import
		// import java.util.*;
		
		String line = "Hello 45 65.9 true";
		System.out.println(line);
		
		Scanner scLine = new Scanner(line);

		String greet = scLine.next();
		System.out.println(greet);
		
		int num = scLine.nextInt();
		System.out.println(num);
		
		double real = scLine.nextDouble();
		System.out.println(real);
		
		boolean ans = scLine.nextBoolean();
		System.out.println(ans);
		scLine.close();
	}
	// Sec0nd@ryIt
}






