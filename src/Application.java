import playspace.VisibilityProblem;
import playspace.mythreads.MyThread;
import playspace.mythreads.MyThreadChild;

import java.lang.Thread;

/**
 * a class for executing any of the other classes
 * @author interested-mandrake
 *
 */


public class Application {
	
	
	public static void main(String [] args) {
		
		//VisibilityProblem vp = new VisibilityProblem();
		MyThread t = new MyThread();
	}
	
	
	
}
