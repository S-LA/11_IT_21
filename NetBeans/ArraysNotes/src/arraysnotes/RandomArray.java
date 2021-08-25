/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package arraysnotes;

/**
 *
 * @author kwhil
 */
public class RandomArray {

	public static void run(int max) {
		// fill the array with random numbers and then find out 
		// the average of the numbers.
		int[] numbers = new int[max];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
			//			System.out.println(numbers[i]);
		}
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total = total + numbers[i];
		}
		double answer = (double) total / (double) max;
		System.out.println("---\n" + answer);

		// how to find largest and smallest in arrays.
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("largest: " + largest);
		System.out.println("smallest: " + smallest);
		
		// only print values in the array greater than 35.
		for(int i = 0; i < numbers.length;i++){
			if(numbers[i] > 35){
				System.out.println(numbers[i]);
			}
		}

	}
}








