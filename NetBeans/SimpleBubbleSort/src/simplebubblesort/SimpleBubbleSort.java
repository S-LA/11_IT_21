/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package simplebubblesort;

/**
 *
 * @author kwhil
 */
public class SimpleBubbleSort {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int len = 10;
		int[] randomArray  = new int[len];	
		int[] sortedArray = new int[len];	
		
		randomArray = FillRandom.go(randomArray);
		sortedArray = Sorting.bubble(randomArray);

		for (int i = 0; i < len; i++) {
			System.out.println(randomArray[i] +" " + sortedArray[i]);
		}
	}
	
}
