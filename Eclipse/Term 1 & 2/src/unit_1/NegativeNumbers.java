package unit_1;

public class NegativeNumbers {
	public static void main(String[] args) {
		int num = 2345;
		int nnum = -2345;
		System.out.println("00000000000000000000"+Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(nnum));
		
		int max = 2_147_483_647;
		System.out.println("\n0" +Integer.toBinaryString(max));
		int min = max+1;
		System.out.println(Integer.toBinaryString(min));
		
		long check = ( max+1);
		System.out.println(check);
	}

}










