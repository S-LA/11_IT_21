package unit_4;
// this is from CheckPoint 3 -> pg 84
public class Students {
	
	public static int studentCounter = 0; // Persistent variable
	
	private String firstName = "";
	private String surname = "";
	private String IDNo = "";
	private int studentNum = 0;
	
	public Students(String name, String last, String ID) {
		firstName = name;
		surname =  last;
		IDNo = ID;
		studentCounter++;
		studentNum = studentCounter;
	}
	
	public void printNames() {
		System.out.println(studentNum + " " + firstName + " "+ surname + "\t" + IDNo);
	}
	// ACCESSOR METHODS (GETTERS)
	public String getName() {
		String sendName = firstName;
		return sendName;
	}
	public String getSurname() {
		return surname;
	}
	public String getID() {
		return IDNo;
	}
	public int getStudentNum() {
		return studentNum;
	}
	// MUTATOR METHODS (SETTERS)
	public void setFirstName(String input) {
		firstName = input;
	}
	public void setSurname(String input) {
		surname = input;
	}
	public void setIDNo(String input) {
		IDNo = input;
	}
	
	

}





