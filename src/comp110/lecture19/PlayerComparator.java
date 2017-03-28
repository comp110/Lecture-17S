package comp110.lecture19;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    // Constants
    public static final int A_BEFORE_B = -1;
    public static final int EITHER_WAY = 0;
    public static final int A_AFTER_B = 1;

    public static final int NAME = 0, POINTS = 1, EFFICIENCY = 2;

    // Fields
    private int _sortBy;

    public PlayerComparator(int sortBy) {
        _sortBy = sortBy;
    }

    public int compare(Player a, Player b) {
        int result = EITHER_WAY;
        if (_sortBy == NAME) {
            result = this.compareName(a, b);
        } else if (_sortBy == POINTS) {
            result = this.comparePoints(a, b);
        } else if (_sortBy == EFFICIENCY) {
            result = this.compareEfficiency(a, b);
        }
        return result;
    }

    // Helper Methods
    private int compareName(Player a, Player b) {
        return a.getName().compareTo(b.getName());
    }

    private int comparePoints(Player a, Player b) {
        if (a.getPoints() < b.getPoints()) {
            return A_BEFORE_B;
        } else if (a.getPoints() > b.getPoints()) {
            return A_AFTER_B;
        } else {
            return EITHER_WAY;
        }
    }

    private int compareEfficiency(Player a, Player b) {
        if (a.efficiency() < b.efficiency()) {
            return A_BEFORE_B;
        } else if (a.efficiency() > b.efficiency()) {
            return A_AFTER_B;
        } else {
            return EITHER_WAY;
        }
    }

}
