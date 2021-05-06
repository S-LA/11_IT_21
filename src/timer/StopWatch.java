package timer;

public class StopWatch {
	
	public static int counter = 0;
	private int thisTimer = 0;
	// a constructor will be run
	// every time we make a new object
	// it allows parameters to be set for
	// each object.
	public StopWatch(int number) {
		System.out.println("New StopWatch Created. (#" + number + ")" );
		counter++;
		thisTimer = counter;
	}
	public StopWatch() {
		System.out.println(
				"This is a polymorphic constructor");
		counter++;
		thisTimer = counter;
	}
	public StopWatch(String words) {
		System.out.println("This is timer " + words);
		counter++;
		thisTimer = counter;
	}
	// private data types are those
	// that can only be changed via 
	// calling methods that belong to
	// an object once it is created.
	private long startTime = 0;
	private long stopTime = 0;
	
	// getter and setter methods allow us to
	// access the private data.
	public void setStart() {
		startTime = System.nanoTime();
	}
	public void setStop() {
		stopTime = System.nanoTime();
	}
	public long getMilli() {
		long delta = stopTime - startTime;
		delta = delta/1_000_000;
		return delta;
	}
	public double getSeconds() {
		double seconds = stopTime - startTime;
		seconds = seconds / 1000_000_000.0;
		seconds = seconds * 1000.0;
		seconds = Math.round(seconds);
		seconds = seconds / 1000.0;
		return seconds;
	}
	
	public void printCounter() {
		System.out.println("This is timer #" + thisTimer);
	}
	
	
	
}













