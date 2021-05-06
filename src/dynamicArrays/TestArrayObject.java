package dynamicArrays;

public class TestArrayObject {
	public static void main(String[] args) {
		ArrayObject alist = new ArrayObject();
		ArrayObject blist = new ArrayObject();

		for (int i = 0; i < 20; i++) {
			alist.set(i);
			blist.set(i + 20);
		}

		for (int i = 0; i < 20; i++) {
//			System.out.println(alist.fetch(i));
//			System.out.println(blist.fetch(i));
		}

	}
}
