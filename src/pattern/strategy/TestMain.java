package pattern.strategy;

public class TestMain {
	public static void main(String[] args) {
		Seller cupSeller = new CupSeller();
		Seller phoneSeller = new PhoneSeller();
		Mart mart1 = new Mart(cupSeller);
		Mart mart2 = new Mart(phoneSeller);
		
		mart1.order();
		mart2.order();
	}
}
