package unit_4;

//import javax.swing.JOptionPane;

public class UseLine {

	public static void main(String[] args) {
		Line line = new Line();
		Line vert = new Line();
		// needs to ask for size and pattern.
		
		line.size = 10;
		line.pattern = '&';
		vert.sizeVert  =20;
		line.patternVert = '^';
		
		line.draw();
		vert.vertDraw();
		line.draw();
	}
}
