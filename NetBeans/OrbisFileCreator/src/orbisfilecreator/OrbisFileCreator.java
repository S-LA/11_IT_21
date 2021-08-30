/*
 *	ORBIS DATALOG CREATOR 
 */
package orbisfilecreator;

/**
 * IMPORTS
 */
import backend.BellLine;

/**
 *
 * @author kwhil
 */
public class OrbisFileCreator {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		BellLine bellOne = new BellLine();
		bellOne.setTime("08:30");
		bellOne.setDays("1101100");
		bellOne.setClock();
		bellOne.setDaysCheck();
		String outputTest = " [ " + bellOne.getBellNum() + " ]"
			+ " " + bellOne.getTime() + " "
			+ " " + bellOne.getDays() + " "
			+ " " + bellOne.getClock() +" "
			+ " " + bellOne.getDaysCheck();

		System.out.println("RESULT " + outputTest);

		System.out.println(bellOne.getLine());

		

//		System.out.println(bellOne.timeFromMinutes("510"));
		

	}

}
