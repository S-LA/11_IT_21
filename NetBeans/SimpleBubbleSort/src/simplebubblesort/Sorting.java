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
public class Sorting {
	public static int[] bubble(int[] arr){
		int[] tempArr = new int[arr.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		/*
		for(int i = 0; i < arr.length;i++){
			tempArr[i] = arr[i];
		}
		*/
		for(int m = 0; m < tempArr.length;m++){
			for(int n = 0; n < tempArr.length-1;n++){
				if(tempArr[n] > tempArr[n+1]){
					int temp = tempArr[n];
					tempArr[n] = tempArr[n+1];
					tempArr[n+1]= temp;
				}		
			}	
		}	
		return tempArr;
	}	
	
}
