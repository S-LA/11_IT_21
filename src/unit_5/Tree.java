package unit_5;

public class Tree {
	
	private String treeType;
	private double qty;
	private double squareMetre;
	private double treeTypeWater;
	
	public static final double MAXAREA = 1000.00;
	public static double totalWater = 0;
	public static double totalArea = 0;
	
	public Tree(double q,  String t, double a, double w ) {
		qty = q;
		treeType = t;
		squareMetre = a;
		treeTypeWater = w;
		
		setArea(squareMetre, qty);
		setWater(treeTypeWater, qty);
		if(totalArea > MAXAREA) {
			System.out.println("Um... thats not going to work!");
		}
	}
	
	private void setArea(double a, double q) {
		double area = a*q;
		totalArea = totalArea + area;
	}
	
	private void setWater(double w, double q) {
		double water = w*q;
		totalWater = totalWater + water;
	}
	
	public String toString() {
		String all;
		all = "Type: " + treeType + "\n";
		all = all + "Qty : " + qty + "\n";
		all = all + "H2O : " + treeTypeWater + "\n";
		all = all + "m^2 : " + squareMetre + "\n";
		all = all + "T_W : " + totalWater + "\n";
		all = all + "T_A : " + totalArea + "\n";
		return all;
	}
	
	
	
	
	
	
	
	
	
	
	
}





















