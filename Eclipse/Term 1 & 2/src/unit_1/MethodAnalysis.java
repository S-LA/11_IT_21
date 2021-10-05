package unit_1;

public class MethodAnalysis {
	
	public static double sqr(double value) {
		double send = Math.pow(value, 2);
		return send;
	}
	public static void main(String[] args) {
		int val = 25;
		double root = Math.sqrt(val);
		System.out.println(root);
		
		double ex = Math.pow(5,2);
		System.out.println(ex);
		double ex2 = sqr(5);
		System.out.println(ex2);
		
		double ab = -34;
		System.out.println(Math.abs(ab));
			
		int ac = -34;
		System.out.println(Math.abs(ac));
		
		double rnd = 9.56;
		long rnd_val = Math.round(rnd);
		System.out.println(rnd_val);
		

	}

}



