package timer;

public class TestArithmetic {
	public static void main(String[] args) {
		
		Arithmetic firstValues = new Arithmetic(20, 5);
		System.out.println(firstValues.add());
		firstValues.whichSumIsThis();
		
		Arithmetic second = new Arithmetic(30,6);
		System.out.println(second.add());
		second.whichSumIsThis();
		firstValues.whichSumIsThis();
		
		
		
		
	}
}
