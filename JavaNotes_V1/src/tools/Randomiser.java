/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package tools;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kwhil
 */
public class Randomiser {

	private final Random rand;
	private int min;
	private int max;
	private int delta;
	private ArrayList<Integer> historicalArray = new ArrayList<Integer>();
	private int num;	
	public Randomiser(int l, int u) {
		rand = new Random();
		min = l;
		max = u;
		delta = max - min;
	}
	

	private int randParam() {
		return rand.nextInt(delta) + min;
	}

	public int getRand() {
		int r = randParam();
		num = r;	
		historicalArray.add(r);
		return r;
	}
	public void printString(){
		 System.out.println("rand   :" + num); 
	} 

	public int[] getRandArray(int[] inArr){ 
	for (int i = 0; i < inArr.length; i++) {
			int r = this.getRand();
			inArr[i] = r;
		}
	return inArr;
}	
	/*	
	public int getNewRand(){
		int r = getRand();
		int arrlen  = historicalArray.size();
		boolean repeat = false;
		if(arrlen >= delta){
			return r;
		}
		while(!repeat){
			boolean found = false;
			for(int index = 0; index <  arrlen ; index++){
				int val = historicalArray.get(index);
				if(historicalArray.get(index)== r){
					r = getRand();
//					System.out.println("found");
					repeat = true;
					found = true;
					if(arrlen >= delta){
						return r;
					}
				}
			}
			if(found == false){
				return r;
			}
				
			
		}
		historicalArray.add(r);
		return r;
	}
	*/	
}
