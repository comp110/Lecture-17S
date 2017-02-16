package comp110.lecture10;

import comp110.Console;

public class PathTests {

	public static void main(String[] args) {

		Console console = new Console();

		Point a = new Point(1.0, 1.0);
		Point b = new Point(2.0, 1.0);
		Point c = new Point(3.0, 2.0);
		Point d = new Point(4.0, 1.0);
		Point[] sample = new Point[] { a, b, c, d };

		Path path = new Path(sample);

		console.print("Path: " + path);
		console.print("Highest: " + path.getHighestPoint());
		console.print("Quadrant 1? " + path.isInQuadrant(1));
		console.print("Quadrant 2? " + path.isInQuadrant(2));

	}

}
