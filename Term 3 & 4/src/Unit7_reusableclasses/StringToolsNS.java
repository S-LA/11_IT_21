package Unit7_reusableclasses;

public class StringToolsNS {
	private String str;
	
	//parameterised constructor
	public StringToolsNS(String s){
		str = s;
	}
	// accessor
	public String getStr() {
		return str;
	}
	// mutator
	public void setStr(String s) {
		str = s;
	}
	// the toString gives info about value.
	public String toString() {
		String send = "The string is: " + str;  
		return send;
	}
	
	
	
	
	
	
	
	public int countWords() {
		String in = " "+ str;
		int countwords = 0;
		
		char prev;
		char curr;
		
		for(int i = 1; i< in.length();i++) {
			prev = in.charAt(i-1);
			curr = in.charAt(i);
			if(Character.isLetter(prev) == false && Character.isLetter(curr)==true) {
				countwords++;
			}
		}
		return countwords;
	}
	
	public void firstCaps() {
		String temp = " " + str;
		temp = temp.toLowerCase();
		String newStr = "";
		char prev;
		char curr;
		for(int i = 1; i< temp.length();i++) {
			prev = temp.charAt(i-1);
			curr = temp.charAt(i);
			if(!Character.isLetter(prev) && Character.isLetter(curr)) {
				newStr = newStr + Character.toUpperCase(curr);
			} else { 
				newStr = newStr + curr;
			}
		}
		str = newStr;
	}
	public void removeVowels() {
		String temp = " " + str;
		String newStr = "";
		char prev;
		char curr;
		final String VOWELS = "aeiouAEIOU";
		
		for(int i = 1; i < temp.length();i++) {
			prev = temp.charAt(i-1);
			curr = temp.charAt(i);
			boolean a1 = Character.isLetter(prev);
			int a2 = VOWELS.indexOf(curr);
			int a3  = VOWELS.indexOf(curr);
			if(!Character.isLetter(prev) && VOWELS.indexOf(curr) >= 0 || VOWELS.indexOf(curr) == -1){
				newStr = newStr + curr;
			}
		}
		str = newStr;
		
	}
	
	
	
	
	
	
	
	
	
	
	public void pigLation() {
		
	}
	private String moveConsonantAddAy(String w) {
		return w;
	}
	
}






