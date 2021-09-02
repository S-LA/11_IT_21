/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package arraylistsorting;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kwhil
 */
public class BubbleArrayList {

	public static void bubbleSort() {

		ArrayList<Integer> arr;
		arr = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			int r = rand.nextInt(10);
			arr.add(r);
		}

		// write your own solution to do a bubble sort on the 
		// array in the list.
	}
}
