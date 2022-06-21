package concurrencyExample;

public class SimpleThreadWithLambda{
	
	public static void main(String[] args) {		
		Thread thread = new Thread().currentThread();
		System.out.println(thread.getName());
		
		Runnable sloth = () -> System.out.println("Execution Runnable!");
		sloth.run();
		
	}
	
	@FunctionalInterface public interface Runnable {
		void run();
	} 
}
