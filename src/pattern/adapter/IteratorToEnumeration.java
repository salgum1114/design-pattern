package pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author salgu_000
 * 구성을 통한 방법, 위임을 통한 방법
 * @param <E>
 */
public class IteratorToEnumeration<E> implements Enumeration<E>{

	private Iterator<E> iter;
	
	public IteratorToEnumeration(Iterator<E> iter) {
		this.iter = iter;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iter.hasNext();
	}

	@Override
	public E nextElement() {
		return iter.next();
	}

}
