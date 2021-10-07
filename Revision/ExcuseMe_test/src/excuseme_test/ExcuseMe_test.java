/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package excuseme_test;

/**
 *
 * @author kwhil
 */
public class ExcuseMe_test {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Rando option = new Rando(1, 6);
		for (int i = 0; i < 10; i++) {
			int o = option.fetch();
			System.out.println(o);
		}
	}

}
