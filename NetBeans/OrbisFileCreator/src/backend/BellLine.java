/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package backend;

/**
 *
 * @author kwhil
 */
public class BellLine {

	/**
	 * VARIABLES
	 */
	private String time;
	private String days;
	private String clock;
	private String daysCheck;
	private String bellNum;
	private static int totalBellCount = 0;

	/**
	 * CONSTRUCTOR
	 */
	public BellLine() {
		bellNum = getTotalBellNum();
		totalBellCount++;

	}

	/**
	 * SETTERS
	 */
	public void setTime(String timeIn) {
		this.time = minutesFromMidnight(timeIn);
	}

	public void setDays(String daysIn) {
		this.days = binToDays(daysIn);
	}

	public void setClock() {
		clock = timeFromMinutes(this.time);
	}

	public void setDaysCheck() {
		daysCheck = daysToBin(days);
	}

	/**
	 * GETTERS
	 */
	public String getTime() {
		return this.time;
	}

	public String getDays() {
		return this.days;
	}

	public String getClock() {
		return this.clock;
	}

	public String getDaysCheck() {
		return this.daysCheck;
	}

	public static String getTotalBellNum() {
		return Integer.toString(totalBellCount);
	}

	public String getBellNum() {
		return bellNum;
	}

	/**
	 * METHODS
	 */
	private String minutesFromMidnight(String timeIn) {
		String raw = timeIn;
		String[] rawSplit = raw.split(":");

		int hours = Integer.parseInt(rawSplit[0]);
		hours = hours * 60;

		int min = Integer.parseInt(rawSplit[1]);

		int total = hours + min;

		return Integer.toString(total);

	}

	public String timeFromMinutes(String timeIn) {
		int minutes = Integer.parseInt(timeIn);
		int hours = minutes / 60;
		int actualMinutes = minutes - (hours * 60);
		String send = Integer.toString(hours) + ":" + Integer.toString(actualMinutes);
		return send;
	}

	private String binToDays(String daysIn) {
//		int num = Integer.parseInt(daysIn,2);
		String send = Integer.toString(Integer.parseInt(daysIn, 2));

		return send;

	}

	private String daysToBin(String daysIn) {
		int bindaysNum = Integer.parseInt(daysIn);
		String bin = Integer.toBinaryString(bindaysNum);

		StringBuilder binStr = new StringBuilder();

		String[] dow = {"M", "T", "W", "t", "F", "S", "s"};

		for (int i = 0; i < bin.length(); i++) {
			char abit = bin.charAt(i);
			if (abit == '1') {
				binStr.append(dow[i]);
			} else if (abit == '0') {
				binStr.append("-");
			}
		}
		
		return binStr.toString();
	}

	private String createTheLine() {
		String theLine = "{\"hora\":" + this.time + ","
			+ "\"identificador\":" + this.bellNum + ","
			+ "\"canal\":1,"
			+ "\"tipo\":1,"
			+ "\"modopr\":2,"
			+ "\"dias\":" + this.days + ","
			+ "\"periodo\":0,"
			+ "\"time\":0,"
			+ "\"diasfin\":0,"
			+ "\"horafin\":0,"
			+ "\"tiempoon\":2,"
			+ "\"tiempooff\":0},";
		return theLine;
	}

	public String getLine() {
		return this.createTheLine();
	}

}
