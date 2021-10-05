package unit_4;

public class TestStudents {

	public static void main(String[] args) {
		Students one = new Students("James", "Remote","19234");
		Students two = new Students("Kea", "Nhlapo", "69420");
		Students thr = new Students("Shrek","Swamp","18420");
		
		one.printNames();
		two.printNames();
		thr.printNames();
	}

}
