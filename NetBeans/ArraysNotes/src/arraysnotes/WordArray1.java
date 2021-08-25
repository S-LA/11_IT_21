/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package arraysnotes;

import javax.swing.JOptionPane;

/**
 *
 * @author kwhil
 */
public class WordArray1 {

	public static void run() {
		String[] wrdArr = new String[4];
		int size = 0;
		wrdArr[size] = JOptionPane.showInputDialog("Type any word");
		while(!wrdArr[size].equalsIgnoreCase("stop")){
			size++;
			wrdArr[size] = JOptionPane.showInputDialog("Type any word");
		}
		System.out.println("there are " + size + " words");
		
//		for(int i = 0; i < wrdArr.length; i++){
		for(int i = 0; i < size; i++){
			System.out.println(wrdArr[i]);
		}
	}

}
