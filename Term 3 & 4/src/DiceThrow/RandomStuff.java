package DiceThrow;

import java.util.Random;

public class RandomStuff {
	
	private static int randomNum;
	
	public RandomStuff() {
		Random rand = new Random();
		randomNum =rand.nextInt(6)+1;
	}
	public int getRandomNum() {
		return randomNum;
	}

}
