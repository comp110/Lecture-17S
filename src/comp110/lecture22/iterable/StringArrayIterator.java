package comp110.lecture22.iterable;

import java.util.Iterator;

public class StringArrayIterator implements Iterator<String> {

	private int _i;
	private String[] _array;

	public StringArrayIterator(String[] array) {
		_array = array;
		_i = 0;
	}

	public boolean hasNext() {
		// TODO: How do we know if there is another element in the array?
		return false;
	}

	public String next() {
		// TODO: Load the next element. Increment _i. Return the next element.
		return "";
	}

}