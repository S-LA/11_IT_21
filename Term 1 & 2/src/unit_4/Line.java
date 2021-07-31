package unit_4;
// this is an object to draw a line.
public class Line {
	
	int size = 10;
	int sizeVert = 4;
	char pattern = '*';
	char patternVert = '^';
	
	public void draw() {
		for(int i = 0; i < size;i++) {
			System.out.print(pattern);
		}
		System.out.println();
	}
	public void vertDraw() {
		for(int i = 0; i < sizeVert;i++) {
			System.out.print(patternVert);
			System.out.println(patternVert);
		}
	}
}
