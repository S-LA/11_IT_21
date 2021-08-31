/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package stringarrayproj;

import java.util.Random;

/**
 *
 * @author kwhil
 */
class NumberSorting {

	static void sort(int number) {
		int values = number;
		int[] array = new int[number];

		// Random Stuff
		Random rand = new Random();
		int max = 5;

		// filling array
		for (int i = 0; i < values; i++) {
			int r = rand.nextInt(max);
			array[i] = r;
		}
		// original array
		for (int i : array) {
			System.out.print(i + " ");
		}

		/*
			SORTING
		 */
		// section sort
		// ele = the current ELEment.
		// nxt = the next element in array
		int val = values;
		for (int ele = 0; ele <= val ; ele++) {
			for (int nxt = ele + 1; nxt < val; nxt++) {
				if (array[ele] > array[nxt]) {
					int temp = array[nxt];
					array[nxt] = array[ele];
					array[ele] = temp;
					System.out.println();
					for (int i : array) {
						System.out.print(i + " ");
					}
				}
			}
		}
		System.out.println();
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
