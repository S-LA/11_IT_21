package netbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Unit7_reusableclasses.StringToolsNS;

public class IntroToGui { 

	public static void main(String[] args) {
		// the first element for any GUI is the Frame.
		// the frame is basically just a background with specific dimensions.
		
		JFrame mainframe = new JFrame("First GUI");
		// JFrame and friends all belong to the swing package that needs to be
		// imported.
		
		//the next element is the label.
		JLabel infoLabel = new JLabel();
		infoLabel.setText("Input info here");
		infoLabel.setBounds(50,10,200,40);
		
		// the set bounds  (x_start, y_start, x_length, y_height)
		JTextField inputString = new JTextField();
		inputString.setBounds(50, 50, 200, 50);
		
		JButton pressGo = new JButton();
		pressGo.setText("GO");
		pressGo.setBounds(50, 100, 200, 50);
		
		JTextField outputString = new JTextField();
		outputString.setBounds(50, 150, 200, 50);
		
		pressGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takeInput = inputString.getText();
				StringToolsNS pig = new StringToolsNS(takeInput);
				pig.pigLation();
				outputString.setText(pig.getStr());
			}
		});
		
		
		
		// we then add all the parts to the mainframe
		mainframe.add(infoLabel);
		mainframe.add(inputString);
		mainframe.add(pressGo);
		mainframe.add(outputString);
		// this comes after we have added all other elements into the frame.
		// just like maths (x,y)
		mainframe.setSize(300,300);
		mainframe.setLayout(null);
		mainframe.setVisible(true);
		
		
	}

}






