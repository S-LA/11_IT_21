package dynamicArrays;

import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		// first lets look at Arrays
//		int[] intArray = new int[]{1,2,3,4,5}; //static array
		// the size of the array cannot be changed, this is annoying...
		
		// so the ArrayList was created!
		// format is like an object. 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int tens = 0;
		for(int i = 0; i< 20; i++) {
			tens = 10*i;
//			System.out.println(tens);
			list.add(tens); // add an element to the array
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println(list.get(i));// get element from array
		}
		
		ArrayList<Object> arrayOne = new ArrayList<Object>();
		
		ArrayList<Integer> listA = new ArrayList<Integer>();
		
		arrayOne.add(listA);
		
		
	}

}
