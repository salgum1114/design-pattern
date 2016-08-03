package pattern.singleton;

public class SingletonCounter {
	private static SingletonCounter singleton = new SingletonCounter();
	private int count = 0;
	
	private SingletonCounter() {
		
	}
	
	public static SingletonCounter getInstance() {
		return singleton;
	}
	
	public int getNextInt() {
		return ++count;
	}
}
