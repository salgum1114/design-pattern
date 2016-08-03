package pattern.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class TestMain {
	
	/**
	 * @param iter
	 * 
	 * 메소드로 만들어서 사용한 방법
	 * 
	 * @return
	 */
	public static Enumeration<String> iteratorToEnumeration(final Iterator<String> iter) {
		return new Enumeration<String>() {

			@Override
			public boolean hasMoreElements() {
				return iter.hasNext();
			}

			@Override
			public String nextElement() {
				return iter.next();
			}
			
		};
	}
	
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
		
		Enumeration<String> iter = new IteratorToEnumeration<String>(list.iterator()); // 위임을 통한 방법
		Enumeration<String> iter2 = iteratorToEnumeration(list.iterator());
		TestMain.goodMethod(iter);
		TestMain.goodMethod(iter2);
	}
}
