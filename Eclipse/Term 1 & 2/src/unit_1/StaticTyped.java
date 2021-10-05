package unit_1;

public class StaticTyped {
	
	private static int numVar = 2; // secured variable
	
	public static int get_NumVar() {
		int send = numVar;
		return send;
	}
	public static void set_NumVar(int input) {
		numVar = input;
	}
	
	public static void main(String[] args) {
		/*
		 *  Static methods belong to the class in which they are defined.
		 *  Typed methods return a value, the <get_NumVar> method is typed.
		 */
		set_NumVar(2);
		System.out.print(get_NumVar());
		if(get_NumVar() == 3) {
			System.out.print("\nDo something");
		}
	
		
	}

}
