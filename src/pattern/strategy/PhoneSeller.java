package pattern.strategy;

public class PhoneSeller implements Seller {

	@Override
	public void sell() {
		System.out.println("폰 팔아요");
	}

}
