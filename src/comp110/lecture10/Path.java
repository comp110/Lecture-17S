package comp110.lecture10;

public class Path {

	private Point[] _points;

	public Path(Point[] points) {
		_points = points;
	}

	public Point getHighestPoint() {
		// TODO: Implement Algorithm
		Point highest = _points[0];
		for (int i = 1; i < _points.length; i++) {
			Point point = _points[i];
			if (point.getY() > highest.getY()) {
				highest = point;
			}
		}
		return highest;
	}

	public boolean isInQuadrant(int quadrant) {
		// TODO: Implement Algorithm
		for (int i = 0; i < _points.length; i++) {
			Point point = _points[i];
			if (point.getQuadrant() != quadrant) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i < _points.length; i++) {
			Point point = _points[i];
			result = result + " " + point + " ";
		}
		return result + "]";
	}

}