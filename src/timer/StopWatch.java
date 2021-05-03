package timer;

public class StopWatch {
	
	// a constructor will be run
	// every time we make a new object
	// it allows parameters to be set for
	// each object.
	public StopWatch(int number) {
		System.out.println("New StopWatch Created. (#" + number + ")" );
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
	
	
}







