public class Clicker implements Runnable {
	private int click = 0;
	private Thread t;
	private volatile boolean running = true;
	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	public int getClick(){
		return click;
	}
	@Override
	public void run() {
		while (running) {
			click++;
		}
		
		if(!running){
			System.out.println(t.getName() +  " was stopped");
		}
		
	}
	public void stopThread() {
		System.out.println(t.getName() +  " call stop");
		running = false;
	}
	public void startThread() {
		t.start();
		System.out.println(t.getName() +  " was started!");
	}
}
