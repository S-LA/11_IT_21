package unit_1;

public class CountIn {
	public static void main(String[] args) {
		
		String sentence = "In the ping i'm going to ink a link";
		
		int len = sentence.length();
		int count = 0;
		for(int i = 0; i < len;i++) {
			
			if(sentence.subSequence(i, i+2).equals("in")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
