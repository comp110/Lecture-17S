package comp110.lecture05;

import comp110.Console;

public class Question1 {

	public static void main(String[] args) {

		Console console = new Console();

		boolean looping = true;

		while (looping) {

			int choice = console.promptInt("Give me a number.");

			if (choice % 5 == 1) {
				console.print("A");
			} else {
				looping = false;
			}

		}

		console.print("B");

	}

}
