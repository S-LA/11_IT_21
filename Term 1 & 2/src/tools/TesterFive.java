package tools;

public class TesterFive {

	public static void main(String[] args) {
		double checkA = 2e2;
		double checkB = 2e20;
		double checkC = -2e-2;
		System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(checkA)));
		System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(checkB)));
		System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(checkC)));

	}

}
