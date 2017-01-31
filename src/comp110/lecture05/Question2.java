package comp110.lecture05;

import comp110.Console;

public class Question2 {

	public static void main(String[] args) {

		Console console = new Console();

		int i = 0;

		if (i < 1) {
			while (i < 10) {
				if (i > 5) {
					while (i < 8) {
						i++;
					}
				}
				i++;
			}
		}

		console.print("B");

	}

}
