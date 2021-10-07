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
public class AndOrConditions {
	public static void mainEight(String[] args) {
		int n1 = 6;
		int n2 = 10;
		int n3 = 15;

		// and &&
		// or ||

		if((n1==5) && (n2 == 10)){
			System.out.println("First and works");
		}

		if((n1 == 15) || n2 == 10){
			System.out.println("Or now works");
		}

		if((n1 == 5 || n2 == 10) && n3 == 15){
			System.out.println("lots of condtions");
		}
	}
	
}
