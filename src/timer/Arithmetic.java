package timer;

public class Arithmetic {
	/*
	 * This is a class that can create an object. When you call the object it should
	 * have two parameters, the parameters will be two real numbers. Arithmetic one
	 * = new Arithmetic(34.0, 20.6);
	 * 
	 * These two parameters must be assigned to two private variables.
	 * 
	 * Then the class must contain 5 methods each method must return the result of
	 * addition, subtraction, multiplication, division and modulo.
	 * 
	 * e.g. ... one.add();
	 */
	
	static int counter = 0;// this values is independent from 
	// the objects created.
	private int thisCounter = 0;
	public Arithmetic(double inputOne, double inputTwo) {
		valOne = inputOne;
		valTwo = inputTwo;
		counter++;
		thisCounter = counter;
	}
	
	public void whichSumIsThis() {
		System.out.println("This is sum " + thisCounter);
	}
	

	private double valOne;
	private double valTwo;

	public double add() {
		return valOne + valTwo;
	}

	public double minus() {
		return valOne - valTwo;
	}

	public double times() {
		return valOne * valTwo;
	}

	public double divide() {
		return valOne / valTwo;
	}

	public double mod() {
		return valOne % valTwo;
	}

	/*
	 * THIS IS ADDED TO ALLOW POLYMORPHIC INPUT USING AND THEN ALLOWS GETTERS AND
	 * SETTERS FOR THE TWO VALUES
	 */

	public Arithmetic() {
	}

	public void setValOne(double input) {
		valOne = input;
	}

	public void setValTwo(double input) {
		valTwo= input;
	}
	public void setBothVal(double inputOne, double inputTwo) {
		valOne = inputOne;
		valTwo= inputTwo;
	}
	public double getValOne() {
		return valOne;
	}
	public double getValTwo() {
		return valTwo;
	}
	public void printBoth() {
		System.out.println("ValOne = " + valOne);
		System.out.println("ValTwo = " + valTwo);
	}
	


}
