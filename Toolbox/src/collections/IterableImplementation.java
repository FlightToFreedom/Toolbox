package collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableImplementation<T> implements Iterable<T>{

	private final T[] objects;

	public IterableImplementation(T[] objects){
		this.objects=objects;;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}


	/**
	 * Inner custom iterator
	 * @author eiorio
	 *
	 * @param <T>
	 */
	class MyIterator implements Iterator<T>{

		int start=-1;
		int size=objects.length;

		@Override
		public boolean hasNext() {
			return start<size-1;
		}

		@Override
		public T next() {
			if(++start<size){
				return objects[start];
			}
			throw new NoSuchElementException();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	/**
	 * Run
	 * @param args
	 */
	public static void main(String[] args){
		Integer[] ints=new Integer[]{3,6,1,4,5,6};
		IterableImplementation<Integer> ii=new IterableImplementation<Integer>(ints);
		for(Integer i: ii){
			System.out.println(i);
		}
	}
}
