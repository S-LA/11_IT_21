package unit_2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Details {
	public static void main(String[] args) {
		// INPUT: 
		// Name ID HEIGHT(m) smoke
		// Kurt 900404 1.8 true
		// input: using JOptionPane
		
		// out: Name : x
		//      ID   : x
		//		H(m) : x
		// 		smoke: x	
		
		String inputInfo = JOptionPane.showInputDialog("Info");
		
		Scanner scan = new Scanner(inputInfo);
		String name = scan.next();
		String id = scan.next();
		String h = scan.next();
		String smoke = scan.next();
		
		System.out.print("INFO\n" + "Name: " + name + "\nID: " + id + "\nHeight: " + h + "\nsmoke: " + smoke);  
		
//		ArrayList<String> check = new ArrayList<String>(); 
////		int counter = 0;
//		while(scan.hasNext()) {
//			String val = scan.next();
//			check.add(val);
//		}
//		System.out.print("INFO\n" + "Name: " + check.get(0) + "\nID: " + check.get(1) + "\nHeight: " + check.get(2) + "\nsmoke: " + check.get(3));  
//		
	}
}





