package comp110.lecture22.iterable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterableExamples {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("the");
		set.add("quick");
		set.add("brown");
		set.add("fox");
		set.add("jumped");
		set.add("over");
		set.add("the");
		set.add("fence");

		// TODO: Loop through the set using an Iterator
		Iterator<String> itr = set.iterator();

		// TODO: Loop through the set using a for-each loop

	}

}
