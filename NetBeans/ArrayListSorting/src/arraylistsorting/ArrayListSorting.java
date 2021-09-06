/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package arraylistsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kwhil
 */
public class ArrayListSorting {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/*
		/*
			Array lists are dynamic (get bigger and smaller)
			as we add or remove.
		*/
		String var = "22";
		ArrayList<Integer> arr = new ArrayList<>();
		int var2 = 2;
		// instead of adding an element with assignments		
		// we just use the method arr.add(element)
		// arr[0] = 2;
		// arr.add(2);
		Random rand = new Random();
		for(int i = 0; i < 20; i++){
			int r = rand.nextInt(10);
			arr.add(r);
		}
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));

		arr.remove(2);

		System.out.println(arr);
		
		arr.add(2, 99);

		System.out.println(arr);
		
		Collections.sort(arr);		
		System.out.println(arr);
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
		
		BubbleArrayList.bubbleSort();
		System.out.println(arr.size());
		
		
		String str = "dsufgusiefg hello 2";
		Scanner scan = new Scanner(str);
			
		System.out.println(scan.next());
		System.out.println(scan.next());
		
		Random rand2 = new Random();
		int hello = rand2.nextInt(21-15)+15;
		System.out.println(hello);
		
//		System.out.println(scan.nextLine());
	}
	
	
}
