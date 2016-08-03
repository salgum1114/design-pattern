package pattern.iterator;

import java.util.Iterator;

public class TestMain {
	
	public static void main(String[] args) {
		CountList<String> countList = new CountList<String>();
		countList.add("a");
		countList.add("b");
		countList.add("c");
		
		Iterator<String> iter = countList.iterator();
		
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
	}
}
