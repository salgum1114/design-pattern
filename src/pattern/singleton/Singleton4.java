package pattern.singleton;

public class Singleton4 {

	private Singleton4() {
		
	}
	
	private static class SingletonHolder {
		static final Singleton4 single = new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return SingletonHolder.single;
	}
}
