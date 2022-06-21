package concurrencyExample;

public class ThreadExampleWithRunnble {

	public static void main(String[] args) {
		// Catching the name of currently thread execute 
		Thread t0 = new Thread(new MyRunnable());				
		Thread t1 = new Thread(new MyRunnable());
		//t1.run(); execution in the same thread, because it wasn't called the method Start to delegation of execution for JVM
		Thread t2 = new Thread(() -> System.out.println("Execution part from function lambda"));
		t0.start();
		t1.start();
		t2.start(); // Runnable like lambda
		// Threads execution aren't at the same time. Because the method "start" create a new thread  
		
	}
}
