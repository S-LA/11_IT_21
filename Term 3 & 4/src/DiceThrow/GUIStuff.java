package DiceThrow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIStuff {
	
	public static void runGUI() {
		
		JFrame f = new JFrame("Dice");
		//-------- All the parts
		//LABEL
		JLabel infoLabel = new JLabel();
		infoLabel.setText(DiceStuff.info);
		infoLabel.setBounds(10, 10, 100, 20);
		
		// BUTTONS
		int btnSize = 100;
		JButton diceOneBtn = new JButton("A");
		diceOneBtn.setBounds(10, 50, btnSize, btnSize);
		
		JButton diceTwoBtn = new JButton("B");
		diceTwoBtn.setBounds(((btnSize+20)), 50, btnSize, btnSize);
		
		JButton resetBtn = new JButton("RESET");
		resetBtn.setBounds(250, 50, btnSize, btnSize);
		resetBtn.setBackground(Color.red);
		// TEXT OUT
		JLabel diceA_label = new JLabel("Dice A");
		diceA_label.setBounds(10, 160, 100, 20);
		JTextField diceResultA  =new JTextField();
		diceResultA.setBounds(10, 180, 100, 50);
		
		JLabel diceB_label = new JLabel("Dice B");
		diceB_label.setBounds(10, 230, 100, 20);
		JTextField diceResultB  =new JTextField();
		diceResultB.setBounds(10, 250, 100, 50);
		
		JLabel diceT_label = new JLabel("Dice T");
		diceT_label.setBounds(10, 300, 100, 20);
		JTextField diceResultT  =new JTextField();
		diceResultT.setBounds(10, 320, 100, 50);
		
		// place activation 
		diceOneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
				RandomStuff randOne = new RandomStuff();
				diceResultA.setText(Integer.toString(randOne.getRandomNum()));
				diceOneBtn.setBackground(Color.green);
			}	
	    });
		
		diceTwoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  
				RandomStuff randTwo = new RandomStuff();
				diceResultB.setText(Integer.toString(randTwo.getRandomNum()));
				String one = diceResultA.getText();
				int getResultA = Integer.parseInt(one);
				int getResultB = Integer.parseInt(diceResultB.getText());
				int getFinal = getResultA + getResultB;
				final String send = Integer.toString(getFinal);
				diceResultT.setText(send);
				diceTwoBtn.setBackground(Color.green);
			}	
		});
		
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diceOneBtn.setBackground(null);
				diceTwoBtn.setBackground(null);
				diceResultA.setText(null);
				diceResultB.setText(null);
				diceResultT.setText(null);
			}
		});
		
		
		f.add(infoLabel);
		f.add(diceOneBtn);
		f.add(diceTwoBtn);
		f.add(diceA_label);
		f.add(diceResultA);
		f.add(diceB_label);
		f.add(diceResultB);
		f.add(diceT_label);
		f.add(diceResultT);
		f.add(resetBtn);
		// -------
		f.setSize(400,420);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	
}
