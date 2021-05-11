package unit_5;

public class FruitUI {

	public static void main(String[]args) {
		Fruit apples = 	new Fruit("apples", 10, 0.7);
		System.out.println(apples.toString());
		
		Fruit mango = new Fruit("mango", 5, 3.5);
		System.out.println(mango.toString());
		
		System.out.println("\nTotal Cost  : " + Fruit.totalCost);
		System.out.println("Total Quantity: " + Fruit.totalStock);
	}

}
