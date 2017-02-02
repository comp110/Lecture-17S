package comp110.lecture06;

import comp110.Console;

public class BooleanExpr {

	public static void main(String[] args) {

		Console c = new Console();

		boolean a = true;
		boolean b = false;
		c.print(!b && b || !a);

	}

}
