package concurrencyExample;

public class ThreadWithSynchronized {
	
	static int i = 0;
	public static void main(String[] args) {
		MyRunnable	runnable = new MyRunnable();
		
		Runnable runnableWithSync = ()->{
			synchronized(ThreadExampleWithRunnble.class){
			// it create a box between resources. Every call were waiting this block that it's using the class with context   
				i++;
				String name = Thread.currentThread().getName();
				System.out.println(name+ ":" + i);
			}			
		};
		
		
		Thread t0 = new Thread(runnableWithSync);
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnableWithSync);
		Thread t3 = new Thread(runnable);	
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();	
	}
	
	public static class MyRunnable implements Runnable {
		@Override
		public void run() {	
				i++;
				String name = Thread.currentThread().getName();
				System.out.println("Thread Without synchronized: "+name+ ":" + i);
		}
	}
}
