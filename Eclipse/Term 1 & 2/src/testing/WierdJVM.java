package testing;

public class WierdJVM {

	public static void main(String[] args) {
		
		Integer val2 = 128;
		Integer val3 = 128;
		
		if(val2.equals(val3)) {
			System.out.println("same");
		} else { 
			System.out.println("not same");
		}
	}

}
