/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package excuseme_test;

import java.util.Random;

/**
 *
 * @author kwhil
 */
public class Rando {
	
	private final Random rand;
	private int min;
	private int max;
	
	public Rando(){
		rand = new Random();
	}
	public Rando(int min, int max){
		this.min = min;
		this.max = max+1;
		rand = new Random();
	}

	public int fetch(){
		int upper = this.max - this.min;
		int lower = this.min;
		int r = rand.nextInt(upper)+lower;
		return r;	
	}
	
}
