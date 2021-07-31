package unit_5;

public class FruitUI {
	
	public static void line() {
		System.out.println("-----------------------");
	}

	public static void main(String[]args) {
		
	
		Fruit apples = 	new Fruit("apples", 10, 0.7);

		System.out.println(apples.toString());
		line();
		System.out.println("\nTotal Cost  : " + Fruit.totalCost);
		System.out.println("Total Quantity: " + Fruit.totalQty + "\n");
		line();
		Fruit mango = new Fruit("mango", 5, 3.5);
		System.out.println(mango.toString());
		line();
		System.out.println("\nTotal Cost  : " + Fruit.totalCost);
		System.out.println("Total Quantity: " + Fruit.totalQty + "\n");
		line();
		Fruit oranges = new Fruit("oranges", 15, 0.8);
		System.out.println(oranges.toString());
		line();
		System.out.println("\nTotal Cost  : " + Fruit.totalCost);
		System.out.println("Total Quantity: " + Fruit.totalQty + "\n");
		line();
		
//		System.out.println("3 x " + apples.getDescription()  
//						  + " @ " + apples.getSellingPrice()
//					    + " = R " + (3*apples.getSellingPrice()));
		line();
		apples.sell(3);
		mango.sell(4);
		oranges.sell(2);
		
		line();
		System.out.println("\nTotal Cost  : " + Fruit.totalSales);
		System.out.println("Total Quantity: " + Fruit.totalQty + "\n");
	}
	
	

}





