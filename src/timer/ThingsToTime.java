package timer;

public class ThingsToTime {

	public static void main(String[] args) {
		StopWatch one = new StopWatch(1);
		StopWatch two = new StopWatch();
		StopWatch three = new StopWatch("Three");
		one.printCounter();
		two.printCounter();
		three.printCounter();
		one.setStart();
		
		three.setStart();
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		one.setStop();
//		System.out.println(one.getMilli());
		System.out.println(one.getSeconds());
		//-------------------------------------------
		two.setStart();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		two.setStop();
		System.out.println(two.getSeconds());
		three.setStop();
		System.out.println(three.getSeconds());
	}

}
