/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package sorting;

/**
 *
 * @author kwhil
 */
public class Bubble {
	/**
	 * Normal Slow Bubble Sort
	 * Checks Every value the next
	 * @param arrIn
	 * @return 
	 */
	public static int[] sort(int[] arrIn) {
		int len = arrIn.length;
		int[] tempArr = new int[arrIn.length];
		System.arraycopy(arrIn, 0, tempArr, 0, len);
		for (int index = 0; index < len; index++) {
			for (int next = 0; next < len - 1; next++) {
				if (tempArr[next] > tempArr[next + 1]) {
					int temp = tempArr[next + 1];
					tempArr[next + 1] = tempArr[next];
					tempArr[next] = temp;
				}
			}
		}
		return tempArr;
	}
	/**
	 * Quicker Bubble Sort
	 * When this has gone though an entire loop without finding
	 * a skip it means it is all sorted and breaks the loop
	 * it also skips every second value.
	 * 
	 * @param arrIn
	 * @return 
	 */

	public static int[] sortQ(int[] arrIn) {
		int len = arrIn.length;
		int[] tempArr = new int[arrIn.length];
		System.arraycopy(arrIn, 0, tempArr, 0, len);
		
		for (int index = 0; index < tempArr.length; index++) {
			boolean done = true;
			for (int next = 0; next < tempArr.length - 1; next++) {
				if (tempArr[next] > tempArr[next + 1]) {
					int temp = tempArr[next + 1];
					tempArr[next + 1] = tempArr[next];
					tempArr[next] = temp;
					done = false;
					next = next + 1;
				}

			}
			if (done == true) {
				break;
			}
		}
		return tempArr;
	}
}
