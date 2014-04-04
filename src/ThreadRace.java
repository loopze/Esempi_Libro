
public class ThreadRace {
	public static void main(String args[]) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
		
		lo.startThread();
		hi.startThread();
		
		try{
			Thread.sleep(5000);
		}
		catch (Exception e){}
		lo.stopThread();
		hi.stopThread();
		System.out.println(lo.getClick()+" vs." + hi.getClick());
		
	
	}
	
}