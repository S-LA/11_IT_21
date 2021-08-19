/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package calculatorproj;

/**
 * @author kwhil
 */
public class Arithmetic {

	private double num1, num2;

	public Arithmetic() {
		num1 = 0;
		num2 = 0;
	}

	public Arithmetic(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}

	public void display() {
		System.out.println("Num 1: " + num1 + " Num 2: " + num2);
	}

	public void setNum1(double n1) {
		num1 = n1;
	}

	public void setNum2(double n2) {
		num2 = n2;
	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}

	public double add() {
		return num1 + num2;
	}

	public double subtract() {
		return num1 - num2;
	}

	public double multiply() {
		return num1 * num2;
	}

	public double divide() throws ArithmeticException {
		if (num2 == 0) {
			//System.out.println("Error: Can not divide by zero"); // Ex4 No 2.1
			throw new ArithmeticException();
		} else {
			return num1 / num2;
		}
	}

	public String toString() {
		return "Num 1: " + num1 + "\nNum 2: " + num2;
	}
}
