package unit_1;

public class TestStringEquality {
	public static void main(String[] args) {
		String emptyStr = new String();
		String str1 = new String("Hello, how are you?");
		String str2 = new String("aeiou");
		String str3 = str1;
		String str4 = new String(str1);
		String strA = "xyz";
//		String strB = "A String is a sequence of characters";
		String strC = strA;
		String strD = new String(strA);
		
		System.out.println("0: " + emptyStr);
		System.out.println("1: " + (str1 == str2));
		System.out.println("2: " + (str1.equals(str2)));
		System.out.println("3: " + (str1 == str3));
		System.out.println("4: " + (str1.equals(str3)));
		System.out.println("5: " + (str1 == str4));
		System.out.println("6: " + (str1.equals(str4)));
		System.out.println("7: " + (strA.equals(strC)));
		System.out.println("8: " + (strA.equals(strD)));
		System.out.println("9: " + (strC.equals(strD)));
		System.out.println("9.1: " + (strC == strD));
		System.out.println("10: " + (strA == strD));
	}
}
