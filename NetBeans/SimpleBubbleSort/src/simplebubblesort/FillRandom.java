/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package simplebubblesort;

import java.util.Random;

/**
 *
 * @author kwhil
 */
public class FillRandom {
	public static int[] go(int[] arr){
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		return arr;
	}	
}
