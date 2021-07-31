package dynamicArrays;

import java.util.ArrayList;
import java.util.Random;

//import javax.swing.JOptionPane;

import timer.StopWatch;
//import tools.MemoryManagement;

public class ArrayComparison {

	public static void main(String[] args) {
		StopWatch timer_1 = new StopWatch(true,"entire runtime");
//		MemoryManagement.checkmem();
		int elements = 100000000;
		Random rand_1 = new Random();
		StopWatch timer_2 = new StopWatch(true, "fill arr");
		int[] staticArray = new int[elements];		
		for(int i = 0; i < elements; i++ ) {
			int number = rand_1.nextInt(9)+1;
			staticArray[i] = number;
		}
		timer_2.setStop();
		
//		MemoryManagement.checkmem();
		/*
		 * FILL DYNAMIC ARRAY
		 */
		StopWatch timer_3 = new StopWatch(true, "fill list");
		Random rand_2 = new Random();
		ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
		for(int i = 0; i < elements; i++ ) {
			int number = rand_2.nextInt(9)+1;
			dynamicArray.add(number);
		}
		
		timer_3.setStop();
		
//		MemoryManagement.checkmem();
		
		/*
		 * SUM AND AVG
		 */
		
		StopWatch timer_4 = new StopWatch(true, "sum arr");
		double arrSum = 0;
		for (int i = 0; i < staticArray.length; i++) {
			arrSum = arrSum + staticArray[i];
		}
		System.out.println("arr sum = " + Math.round(arrSum));
		timer_4.setStop();
		
//		MemoryManagement.checkmem();
		StopWatch timer_5 = new StopWatch(true, "sum lst");
		double lstSum = 0;
		for (int i = 0; i < dynamicArray.size(); i++) {
			lstSum = arrSum + dynamicArray.get(i);
		}
		System.out.println("lst sum = " + Math.round(lstSum));
		timer_5.setStop();
		
		
//		MemoryManagement.checkmem();
		
		timer_1.setStop();
		
		
		
	}

}
