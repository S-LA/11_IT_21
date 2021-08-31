/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package stringarrayproj;

/**
 *
 * @author kwhil
 */
public class StringArrayProj {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		StringArray st = new StringArray();
		System.out.println(st.toString());
		
		System.out.println("SORTING");
		st.selectionSort();
		System.out.println(st.toString());

		NumberSorting.sort(10);		
		
	}
	
}






