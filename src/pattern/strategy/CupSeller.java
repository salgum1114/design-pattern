package pattern.strategy;

public class CupSeller implements Seller {

	@Override
	public void sell() {
		System.out.println("컵 팔아요");
	}

}
