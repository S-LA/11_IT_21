/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package javanotes_v1;

import java.util.ArrayList;
import sorting.Bubble;
import sorting.Selection;
import tools.Randomiser;
import tools.StopWatch;

/**
 *
 * @author kwhil
 */
public class JavaNotes_V1 {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {

		/**
		 * THE RANDOM CLASS Simple object instance of Random with floor and ceiling parameters
		 *
		 */
		int arrlen = 100000;

		for (int x = 0; x < 1; x++) {
			arrlen = arrlen + 5000;
			Randomiser randObj = new Randomiser(0, 50);
			int[] rawArray = new int[arrlen];
//		for (int i = 0; i < arrlen; i++) {
//			int r = randObj.getRand();
//			rawArray[i] = r;
//		}
			rawArray = randObj.getRandArray(rawArray);
			ArrayList<Integer> savedArray = new ArrayList<Integer>();
			for (int p : rawArray) {
				savedArray.add(p);
			}
			System.out.println(" RANDOM ARRAY CREATED");
			StopWatch sw = new StopWatch("new");
			int[] bubbleNormal;
			sw.start();
			bubbleNormal = Bubble.sort(rawArray);
			sw.stop();

			System.out.println(" BUBBLE SOTYDNE");
			StopWatch sw1 = new StopWatch("quick");
			int[] bubbleQuick;
			sw1.start();
			bubbleQuick = Bubble.sortQ(rawArray);
			sw1.stop();

			System.out.println(" selction sort");
			StopWatch sw2 = new StopWatch("sort");
			int[] sortNormal;
			sw2.start();
			sortNormal = Selection.sort(rawArray);
			sw2.stop();
//			/*
			for (int i = 0; i < arrlen; i++) {
				System.out.print(savedArray.get(i));
				System.out.print("\t");
				System.out.print(rawArray[i]);
				System.out.print("\t");
				System.out.print(bubbleNormal[i]);
				System.out.print("\t");
				System.out.print(bubbleQuick[i]);
				System.out.print("\t");
				System.out.print(sortNormal[i]);
				System.out.print("\t");
				System.out.println();

			}
//			 */
			line(36, '#');
			printArrayInfo(bubbleNormal);
			line(36, '#');
			System.out.println("Normal Bubble: " + sw.seconds());
			System.out.println("Quick Bubble : " + sw1.seconds());
			System.out.println("Nomral Sort  : " + sw2.seconds());
		}
	}

	public static void printArrayInfo(int[] arrIn) {
		int len = arrIn.length;
		int[] newArray = new int[len];
		System.arraycopy(arrIn, 0, newArray, 0, len);
		String build = "";
		double divisions = 8;
		double multi = 1 / divisions;
		int position = 0;
		build = build + " " + newArray[len - 1];
		for (int i = 0; i < divisions - 2; i++) {
			position = position + (int) (len * multi);
			build = build + " " + newArray[position];
		}
		build = build + " " + newArray[len - 1];
		System.out.println(build);
	}

	public static void line(int col, char sym) {
		for (int i = 0; i < col; i++) {
			System.out.print(sym);
		}
		System.out.println();
	}
}
