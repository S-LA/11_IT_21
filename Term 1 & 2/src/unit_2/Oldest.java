package unit_2;
import java.util.*;
import javax.swing.*;
public class Oldest {
	public static void main(String[] args) {
		
		String details = JOptionPane.showInputDialog("Enter the name and age");
	      
        Scanner scStr = new Scanner (details); 
        String name = scStr.next();
        String hiName="";
        int age = scStr.nextInt();
        int hiAge=0;
        scStr.close ();
        if (!name.equalsIgnoreCase("Stop"))
        {
           hiName = name;
           hiAge = age;
           details = JOptionPane.showInputDialog("Enter the name and age");
           scStr = new Scanner (details); 
           name = scStr.next();
           age = scStr.nextInt();
           scStr.close ();
        }
        while (!name.equalsIgnoreCase("Stop"))
        {
           
           if (age > hiAge)
           {
              hiName = name;
              hiAge = age;
           }
           details = JOptionPane.showInputDialog("Enter the name and age");
           scStr = new Scanner (details); 
           name = scStr.next();
           age = scStr.nextInt();
           scStr.close ();
        }
        System.out.println ("The oldest boy was " + hiName + " who is " + hiAge + " years old");
		
	}
}
