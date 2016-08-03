package pattern.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TestMain {
	
	public static void goodMethod(Enumeration<String> enu) {
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Enumeration<String> iter = new IteratorToEnumeration<String>(list.iterator());
		TestMain.goodMethod(iter);
	}
}
