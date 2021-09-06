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
public class Selection {

	public static int[] sort(int[] arrIn) {

		int len = arrIn.length;
		int[] tempArr = new int[arrIn.length];
		System.arraycopy(arrIn, 0, tempArr, 0, len);

		int n = arrIn.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (tempArr[j] < tempArr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = tempArr[min_idx];
			tempArr[min_idx] = tempArr[i];
			tempArr[i] = temp;
//			for(int ii : tempArr){
//				System.out.print(ii + " ");
//			}
//			System.out.println();
			
		}
		return tempArr;
	}

}
