package concurrencyExample;

public class MyRunnable implements Runnable {

	public void run() {
		String threadName =  new Thread().currentThread().getName();
		System.out.println(threadName);
	}	
}
