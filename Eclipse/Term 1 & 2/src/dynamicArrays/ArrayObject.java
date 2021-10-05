package dynamicArrays;

import java.util.ArrayList;

public class ArrayObject {
	
	ArrayList<Object> arrayOne = new ArrayList<Object>();
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	public ArrayObject() {
		
	}
	
	public void set(int input) {
		arrayOne.add(input);
	}
//	public int fetch(int input) {
////		int value = arrayOne.get(input);
//		return value;
//	}
}
