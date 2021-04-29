package unit_4;
// this is an object to draw a line.
public class Line {
	
	int size = 10;
	char pattern = '*';
	
	public void draw() {
		for(int i = 0; i < size;i++) {
			System.out.print(pattern);
		}
		System.out.println();
	}
}
