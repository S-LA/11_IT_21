package revision;
import java.math.BigDecimal;
public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double one = 0.2;
		double two = 0.1;
		double sum = one + two;
		System.out.println(sum);
	
		BigDecimal one2 = new BigDecimal(0.2);
		BigDecimal two2 = new BigDecimal(0.1);
		BigDecimal sum2 = one2.add(two2);
		System.out.println(sum2);
		
	
		
	}

}
