package timer;

public class StopWatch {

	private String name = ">>timer: " + counter;
	public static int counter = 0;
	private int thisTimer = 0;

	// a constructor will be run
	// every time we make a new object
	// it allows parameters to be set for
	// each object.
	public StopWatch(int number) {
		System.out.println("New StopWatch Created. (#" + number + ")");
		counter++;
		thisTimer = counter;
	}

	public StopWatch() {
		counter++;
		thisTimer = counter;
	}

	public StopWatch(String words) {
		name = words;
		counter++;
		thisTimer = counter;
	}

	public StopWatch(boolean start, String words) {
		name = words;
		counter++;
		thisTimer = counter;
		if (start == true) {
			setStart();
		}
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
		getMilli();
	}

	public long getMilli() {
		long delta = stopTime - startTime;
		delta = delta / 1_000_000;
		System.out.println(name + " >> " + delta + " ms");
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
