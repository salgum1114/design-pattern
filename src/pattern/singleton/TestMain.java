package pattern.singleton;

public class TestMain {
	public static void main(String[] args) {
		TestMain main = new TestMain();
		main.AMethod();
		main.BMethod();
	}
	
	public void AMethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("AMethod에서 카운터 호출 : " + sc.getNextInt());
		
	}
	
	public void BMethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("BMethod에서 카운터 호출 : " + sc.getNextInt());
	}
}
