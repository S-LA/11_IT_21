package unit_5;

public class Employee {
	
	private String name;
	private double payRate;
	private int employee_ID;

	private static int nextID = 1000;

	public static final double STARTING_PAY_RATE = 7.75;

	public Employee(String name) {
		this.name = name; // the this. keyword applies the info to the object
		employee_ID = getNextID();
		payRate = STARTING_PAY_RATE;
	}

	public Employee(String name, double startingPay) {
		this.name = name;
		employee_ID = getNextID();
		payRate = startingPay;
	}

	public String getName() {
		return name;
	}

	public int getEmpolyeeID() {
		return employee_ID;
	}

	public double getPayRate() {
		return payRate;
	}

	public void changeName(String newName) {
		name = newName;
	}

	public void changePayRate(double newRate) {
		payRate = newRate;
	}

	public static int getNextID() {
		int id = nextID;
		nextID++;
		return id;
	}

}