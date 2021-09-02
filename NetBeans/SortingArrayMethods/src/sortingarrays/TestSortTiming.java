/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package sortingarrays;

/*
	TEST OF SORTS..... hahahaha
	Use the code that has been writen
	and change it to test how the amount
	elements in the array changes the time
	taken to sort.
	-> remove the prints that occur at each sort.
	-> place a loop over the code that will allow 
		the size of the array to be increased by 5000
		elements each time and then sorted 10.
	-> Print the loop count, elements in array and
		time taken.
		" LOOP: 1 | ELEMENTS: 200 | TIME:  0,0021s"
 */
import java.util.Random;

/**
 *
 * @author kwhil
 */
public class TestSortTiming {

	/**
	 * @param args the command line arguments
	 */
	public static void run(String[] args) {
		int values = 0;
		
		for (int loops = 0; loops < 10; loops++) {

			values = values + 5000;
			int[] array = new int[values];
			int[] sorted = new int[values];
			Random rand = new Random();
			int max = 9;
			int min = 0;

			for (int element = 0; element < values; element++) {
				int r = rand.nextInt(max - min + 1) + min;
				array[element] = r;
			}

//		System.out.println(array);
			long startTimer = System.nanoTime();

			for (int element = 0; element < values - 1; element++) {
				for (int next = element + 1; next < values; next++) {
					if (array[element] > array[next]) {
						int temp = array[element];
						array[element] = array[next];
						array[next] = temp;
//						for (int j = 0; j < values; j++) {
//							System.out.print(array[j] + " ");
//						}
//						System.out.println();
					}
				}
			}
//			System.out.println("------------------------------");
//		long endTimer = System.nanoTime();
//		long deltaTimer = endTimer - startTimer;
//		long secs = deltaTimer/1000_000_000;	

			long endTimer = System.nanoTime();
			long deltaTimer = System.nanoTime() - startTimer;
			double secs = ((double) deltaTimer / 1000_000_000d);
//			System.out.println(secs);
			System.out.println("LOOP: " + loops +" | ELEMENTS: " + values +  " | TIME: " + secs);
		}

	}

}
