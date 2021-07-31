package unit_4;

public class FirstObject {
	
	int size = 2;
	char pattern = '*';
	
	public void draw() { // this will draw a line.
		for(int i = 0; i < size; i++) {
			System.out.print(pattern);
		}
		System.out.println();
	}
}
