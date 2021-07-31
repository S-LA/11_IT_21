package unit_1;

public class CheckPoint1 {
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static double add(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		CheckPoint1.add(5, 9);
		String ridingHome = "No Rain";
		if(ridingHome.equals("Rain")) {
			System.out.print("Ah, shame");
		} else {
			System.out.print("Yay");
		}
	}

//	public static void another(String[] args) {
//		System.out.print(add(7,6));
//	}
	
}
