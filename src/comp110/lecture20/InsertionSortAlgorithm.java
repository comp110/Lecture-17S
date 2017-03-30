package comp110.lecture20;

import java.util.Comparator;
import java.util.List;

import comp110.lecture19.Player;

public class InsertionSortAlgorithm {

	// Constants
	public static final int B_BEFORE_A = 1;

	// Fields
	private List<Player> _list;
	private Comparator<Player> _comparator;

	// Constructor
	public InsertionSortAlgorithm(List<Player> list) {
		_list = list;
	}

	// Methods

	/**
	 * An implementation of the insertion sort algorithm follows.
	 * 
	 * Notice it makes use of helper methods which makes it read nicely.
	 */
	public void sort(Comparator<Player> comparator) {
		_comparator = comparator;
		for (int next = 0; next < _list.size(); next++) {
			int current = next;
			while (this.shouldMoveBack(current)) {
				this.moveBack(current);
				current--;
			}
		}
	}

	// Private "Helper" Methods Follow
	// These are for "internal use only"

	/**
	 * Given an index i, compared with the Player at index i - 1, are the two
	 * Player objects correctly ordered?
	 * 
	 * Use _comparator to compare Players at index i and i - 1 and determine if
	 * the Player at index i should move back.
	 */
	private boolean shouldMoveBack(int i) {
		// TODO: Implement this method!
		return false;
	}

	/**
	 * Could index i be swapped with index i - 1?
	 * 
	 * What must be true about the index i - 1?
	 */
	private boolean canMoveBack(int i) {
		// TODO: Implement this method!
		return false;
	}

	/**
	 * Given an index i, swap Player at index i with Player at index i - i
	 */
	private void moveBack(int i) {
		// TODO!
	}

}