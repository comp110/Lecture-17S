package comp110.lecture10;

public class Line {

	private Point _start, _end;

	public Line(Point start, Point end) {
		_start = start;
		_end = end;
	}

	public double getSlope() {
		double rise = _end.getY() - _start.getY();
		double run = _end.getX() - _start.getX();
		return rise / run;
	}

	// TODO: Declare and define isParallel
	public boolean isParallel(Line other) {
		return this.getSlope() == other.getSlope();
	}

	public String toString() {
		return _start + " to " + _end;
	}

}