/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package sortingarrays;

import java.util.Random;

/**
 *
 * @author kwhil
 */
public class SortingArrays {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int values = 10;
		int[] array = new int[values];
		int[] sorted = new int[values];
		Random rand = new Random();
		int max = 9;
		int min = 0;
		
		for(int element = 0; element < values; element++){
			int r = rand.nextInt(max - min + 1) + min;
			array[element] = r;
		}
		
//		System.out.println(array);
		
		for(int element = 0; element < values-1; element++){
			for(int next = element + 1; next < values; next++){
				if(array[element] > array[next]){
					int temp = array[element];
					array[element] = array[next];
					array[next] = temp;
					for(int j = 0; j < values; j++ ){
						System.out.print(array[j] + " ");
					}
					System.out.println();
					
				}
			}
		}

//		for (int i = 0; i < values; i++) {
//			System.out.println();	
//			
//		}
				
	}
	
}
