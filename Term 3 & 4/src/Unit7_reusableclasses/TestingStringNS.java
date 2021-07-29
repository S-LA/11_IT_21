package Unit7_reusableclasses;

public class TestingStringNS {

	public static void main(String[] args) {
		StringToolsNS stns = new StringToolsNS("Hello");
//		String var1 = stns.getStr();
		// implicit parameter.
		System.out.println(stns.toString());
		
		StringToolsNS s1 = new StringToolsNS("Tree is in the garden");
		int numwords = s1.countWords();
		System.out.println("word num:" + numwords);
		StringToolsNS up = new StringToolsNS("make this a capital");
		up.firstCaps();
		System.out.println(up.getStr());
		
		StringToolsNS rv = new StringToolsNS("remove the vowels");
		rv.removeVowels();
		System.out.println(rv.getStr());
		System.out.println();
		
	}
}









