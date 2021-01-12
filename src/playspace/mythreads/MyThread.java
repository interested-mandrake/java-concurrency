package playspace.mythreads;

public class MyThread {
	public MyThread() {
		
		// ways of giving implementation for run method
		
		// class which overrides runnable
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		
		// anonymous class
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("from an anonymous class implementation of the Runnable interface");
			}
		});
		thread2.start();
		
		// lambda expression - Runnable is effectively a functional interface
		Runnable runnable = () -> { System.out.println("from functional interface"); };
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
	}
}
