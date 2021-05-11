package unit_5;

public class Fruit {

	private String type = "";
	private int quantity = 0;
	private double costPrice = 0;
	private double sellingPrice = 0;

	public static double MARKUP = 75;// stays the same not dependent on
	// object
	public static int totalStock = 0;
	public static double totalCost = 0;

	public Fruit(String t, int q, double c) {
		type = t;
		quantity = q;
		costPrice = c;
		sellingPrice = costPrice + costPrice * MARKUP / 100;
		totalStock = totalStock + quantity;
		totalCost = totalCost + sellingPrice * quantity;
	}
	
	public String toString() {
		return "Fruit name: " + type + 
				"\nQuant: " + quantity + 
				"\nCost: R" + costPrice + 
				"\nSelling Price: R" + sellingPrice;
	}

}
