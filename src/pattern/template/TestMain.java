package pattern.template;

public class TestMain {
	public static void main(String[] args) {
		Worker designer = new Designer();
		designer.work();
		Worker gamer = new Gamer();
		gamer.work();
	}
}
