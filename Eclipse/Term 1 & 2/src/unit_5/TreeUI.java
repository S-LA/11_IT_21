package unit_5;

public class TreeUI {

	public static void main(String[] args) {
		
		Tree pine = new Tree(15, "Pine", 1,20);
		System.out.println(pine.toString());
		
		Tree fir = new Tree(12, "Fir", 1.5, 15);
		System.out.println(fir.toString());
		
		Tree oak = new Tree(8, "Oak",2, 22 );
		System.out.println(oak.toString());
		
		Tree marula = new Tree(20, "Marula", 1.8, 10);
		System.out.println(marula.toString());
		
		System.out.println("Total Water:" + Tree.totalWater);
		System.out.println("Total Area:" + Tree.totalArea);
	}

}






