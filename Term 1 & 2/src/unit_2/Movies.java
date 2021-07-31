package unit_2;

import javax.swing.JOptionPane;

import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) throws IOException {
		String message = "Put info in (0), take it out(1)";  
		int option = Integer.parseInt(JOptionPane.showInputDialog(message));
		
		if(option == 0) { // if true write to file
			FileWriter writeTo = new FileWriter("src//unit_2//Top10Movies.txt",true);
			PrintWriter send = new PrintWriter(writeTo);
			String movieInput = JOptionPane.showInputDialog("Input a movie:");
			while(!movieInput.equals("done")) {
				send.println(movieInput);
				movieInput = JOptionPane.showInputDialog("Input a movie:");
				System.out.println("Movie Added");
			}
			send.close();
			
		} else { // read from file
			File read = new File("src//unit_2//Top10Movies.txt");
			Scanner scan = new Scanner(read);
			StringBuilder messageOut = new StringBuilder();
			while(scan.hasNext()) {
				String input = scan.nextLine();
				System.out.println(input);
				messageOut.append(input);
				messageOut.append("\n");
			}
			scan.close();
			
			JOptionPane.showMessageDialog(null, messageOut);
			
		}
//		File movies = 
	}
}
