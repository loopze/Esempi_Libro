public class Clicker implements Runnable {
	private int click = 0;
	private Thread t;
	private boolean running = true;
	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	public int getClick(){
		System.out.println(t.getName() +  " was stopped");
		t.interrupt();
		
		return click;
	}
	@Override
	public void run() {
		while (running) {
			click++;
		}
		System.out.println(t.getName() +  " out of run");
		if(!running){
			System.out.println(t.getName() +  " was stopped");
			t.interrupt();
			System.exit(0);
		}
		
	}
	public void stopThread() {
		System.out.println(t.getName() +  " call stop");
		running = false;
	}
	public void startThread() {
		System.out.println(t.getName() +  " starting...");
		t.start();
		System.out.println(t.getName() +  " was started!");
	}
}
