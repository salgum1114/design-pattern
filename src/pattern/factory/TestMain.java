package pattern.factory;

public class TestMain {
	public static void main(String[] args) {
		Animal a1 = AnimalFactory.create("cat");
		a1.printDescription();
		Animal a2 = AnimalFactory.create("cow");
		a2.printDescription();
		Animal a3 = AnimalFactory.create("dog");
		a3.printDescription();
	}
}