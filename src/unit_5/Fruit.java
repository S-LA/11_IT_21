package unit_5;

public class Fruit {

	private String description = "";
	private int qty = 0;
	private double costPrice = 0;
	private double sellingPrice = 0;

	public static double MARKUP = 75;// stays the same not dependent on
	// object
	public static int totalQty = 0;
	public static double totalCost = 0;

	public Fruit(String t, int q, double c) {
		description = t;
		qty = q;
		costPrice = c;
		sellingPrice = costPrice + costPrice * MARKUP / 100;
		totalQty = totalQty + qty;
		totalCost = totalCost + sellingPrice * qty;
	}
	
	public String toString() {
		return "Fruit name: " + description + 
				"\nQuant: " + qty + 
				"\nCost: R" + costPrice + 
				"\nSelling Price: R" + sellingPrice;
	}
	
	public static double totalSales;
	
	public String getDescription() {
		return description; 
	}
	
	public int getQty() {
		return qty;
	}
	
	public double getSellingPrice() {
		return sellingPrice;
	}
	
	// apples.sell(10);
	public void sell(int q) {
		qty = qty - q;
		totalQty = totalQty - q;
		totalSales = totalSales + (q * sellingPrice);
		System.out.print(q + " x " + description );
		System.out.print(" @ " + sellingPrice );
		System.out.println(" = R " + (q*sellingPrice));
	}
	
	
	
	
	
	
	
	

}





