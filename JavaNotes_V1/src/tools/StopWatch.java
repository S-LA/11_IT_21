/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package tools;

/**
 *
 * @author kwhil
 */
public class StopWatch {

	public StopWatch(String n) {
		name = n;
	}

	/**
	 * NAME OF STOPWATCH
	 */
	private final String name;

	public String getName() {
		return name;
	}

	/**
	 * STARTTIMER
	 */
	private long START;

	public long start() {
		START = System.nanoTime();
		return START;
	}

	public long getSTART() {
		return START;
	}

	/**
	 * STOP TIMER
	 */
	private long STOP;

	public long stop() {
		STOP = System.nanoTime();
		return STOP;
	}

	public long getSTOP() {
		return STOP;
	}

	public void printSTOP() {
		System.out.println(STOP);
	}
	/**
	 * DELTA TIMER
	 */
	private long DELTA;

	private long delta() {
		return STOP - START;
	}

	private int MS;

	public int ms() {
		delta();
		MS = (int) DELTA / 1_000_000;
		return MS;
	}

	private int NS;

	public int ns() {
		NS = (int)delta(); ;
		return NS;
	}

	private double SECONDS;
	public double seconds() {
		SECONDS = delta() /1000000000d;
		SECONDS = Math.round(SECONDS*1000d)/1000d;
		return SECONDS;
	}

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		delta();
		ms();
		ns();
		seconds();
		String collect = "TIMER: "
				+ "name  : " + name + "\n"
				+ "start : " + START + "\n"
				+ "stop  : " + STOP + "\n"
				+ "delta : " + DELTA + "\n"
				+ "ms    : " + MS + "\n"
				+ "ns    : " + NS + "\n"
				+ "s     : " + SECONDS;
		return collect;

	}

	public void printString(){
		System.out.println(this.toString());
	}  

}
