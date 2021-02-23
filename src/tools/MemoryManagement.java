package tools;

public class MemoryManagement {

	public static void checkmem() {
		long heapSize = Runtime.getRuntime().totalMemory();

		// Get maximum size of heap in bytes
		long heapMaxSize = Runtime.getRuntime().maxMemory();

		// get free memory
		long heapFreeSize = Runtime.getRuntime().freeMemory();
		double heapUsedSize = Math.round(heapSize - heapFreeSize);
				
		System.out.println("max size    : " + (heapMaxSize / (1024 * 1024)) + " MB");
		System.out.println("current size: " + (heapSize / (1024 * 1024)) + " MB");
		System.out.println("free mem    : " + (heapFreeSize / (1024 * 1024)) + " MB");
		System.out.println("used mem    : " + Math.round(heapUsedSize/ (1024 * 1024)) + " MB\n");
	}

	public static void main(String[] args) {
		// Get current size of heap in bytes
		checkmem();
		
		int[] array_Num = new int[100000000];
		for (int i = 0; i < 1000; i++) {
			array_Num[i] = i;
		}
		checkmem();
		
		int[] array_Num1 = new int[100000000];
		for (int i = 0; i < 1000; i++) {
			array_Num1[i] = i;
		}
		checkmem();
		int[] array_Num2 = new int[100000000];
		for (int i = 0; i < 1000; i++) {
			array_Num2[i] = i;
		}
		checkmem();
	
	}

}













