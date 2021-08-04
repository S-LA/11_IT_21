package Unit7_reusableclasses;

public class CapsAndVowels {

	public static void main(String[] args) {
		String inputStr = "This is a string";
		
		inputStr = inputStr.toUpperCase();
		System.out.println(inputStr);
		StringToolsNS fix = new StringToolsNS(inputStr);
		
		fix.removeVowels();
		System.out.println(fix.getStr());
	}

}
