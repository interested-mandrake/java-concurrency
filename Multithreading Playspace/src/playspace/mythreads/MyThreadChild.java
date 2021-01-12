package playspace.mythreads;

public class MyThreadChild extends Thread {
	
	public MyThreadChild() {
		System.out.println("we're constructing");
	}
	
	@Override
	public void run() {
		System.out.println("We've overriden Thread's run method");
	}
	
	public void makeThread() {
		MyThreadChild t = new MyThreadChild();
		t.start();
	}
}
