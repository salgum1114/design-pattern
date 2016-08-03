package pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountList<E> implements Iterable<E>{
	
	private List<E> list = new ArrayList<E>();

	public void add(E name) {
		list.add(name);
	}
	
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			int seq = 0;
			
			@Override
			public boolean hasNext() {
				return seq < list.size();
			}

			@Override
			public E next() {
				return list.get(seq++);
			}
		};
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
