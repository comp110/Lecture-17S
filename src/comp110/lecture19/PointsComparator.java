package comp110.lecture19;

import java.util.Comparator;

public class PointsComparator implements Comparator<Player> {

	public int compare(Player a, Player b) {
		if (a.getPoints() < b.getPoints()) {
			return -1;
		} else if (a.getPoints() == b.getPoints()) {
			return 0;
		} else {
			return 1;
		}
	}

}
