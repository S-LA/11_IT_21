package timer;

public class ThingsToTime {

	public static void main(String[] args) {
		StopWatch one = new StopWatch(1);
		StopWatch two = new StopWatch(2);
		
		one.setStart();
//		for(int i = 0; i < 20; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}			
//		}
		one.setStop();
		System.out.println(one.getMilli());
	}

}
