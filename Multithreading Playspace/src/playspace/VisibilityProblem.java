package playspace;

/**
 * a common problem is the visibility problem. if we have two threads
 * accessing the same data, and one reads and updates, and the other reads
 * we can fix this problem using the volatile keyword, forcing data
 * to write to and read from main memory instead of using the intermediate
 * of the cpu cache
 * 
 * vis
 *
 */

public class VisibilityProblem {
	public volatile Integer count = 0;
	
	public Thread readsAndUpdates;
	public Thread reads;
			
	public VisibilityProblem() {
		// init values
		this.readsAndUpdates = new Thread(getIncrementer());
		this.reads = new Thread(getReader());
		
		// start threads
		this.readsAndUpdates.start();
		this.reads.start();
	
	}
	
	public Runnable getIncrementer() { 
		return () -> {
			for(int i = 0; i < 1000000; i++) {
				count++;
			}
			System.out.println("final value of count: " + count);
		};
	}
	
	public Runnable getReader() {
		return () -> {
			for(int i = 0; i < 1000000; i++) {
				if(i % 100000 == 0) {
					System.out.println("current value of count: " + count);
				}
			}
		};
	}

}
