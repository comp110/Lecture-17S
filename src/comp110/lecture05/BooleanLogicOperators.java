package comp110.lecture05;

import comp110.Console;

public class BooleanLogicOperators {

	public static void main(String[] args) {

		Console console = new Console();

		console.print("Give me two booleans:");
		boolean a = console.promptBoolean("a");
		boolean b = console.promptBoolean("b");

		boolean and = false; // TODO initialize and to be: a AND b
		console.print("a AND b is " + and);

		boolean or = false; // TODO initialize or to be: a OR b
		console.print("a OR b is " + or);

		boolean not = false; // TODO initialize notA to be: NOT a
		console.print("NOT a is " + not);

	}

}
