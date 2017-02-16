package comp110.lecture10;

import comp110.Console;

public class LineTests {

	public static void main(String[] args) {

		Console console = new Console();

		Line a = new Line(new Point(0.0, 0.0), new Point(1.0, 1.0));
		Line b = new Line(new Point(0.0, 1.0), new Point(1.0, 2.0));
		Line c = new Line(new Point(0.0, 1.0), new Point(1.0, 0.0));

		console.print("a: " + a + " Slope: " + a.getSlope());
		console.print("b: " + b + " Slope: " + b.getSlope());
		console.print("c: " + c + " Slope: " + c.getSlope());

		console.print("a parallel b: " + a.isParallel(b));
		console.print("a parallel c: " + a.isParallel(c));

	}

}
