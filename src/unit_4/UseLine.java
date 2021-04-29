package unit_4;

import javax.swing.JOptionPane;

public class UseLine {

	public static void main(String[] args) {
		Line line = new Line();
		// needs to ask for size and pattern.
		String str_size = JOptionPane.showInputDialog("size");
		String str_pattern = JOptionPane.showInputDialog("pattern");
		
		line.size = Integer.parseInt(str_size);
		line.pattern = str_pattern.charAt(0);
		line.draw();
		line.pattern = '\u00A7';
		line.draw();
		// HAILEY -> Do CShape.java on page 63
	}
}
