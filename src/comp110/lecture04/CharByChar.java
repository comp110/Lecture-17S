package comp110.lecture04;

import comp110.Console;

public class CharByChar {

	public static void main(String[] args) {

		Console console = new Console("CharByChar");
		console.speed(0.75);

		String input = console.promptString();

		int i = 0;
		while (i < input.length()) {
			console.print(input.charAt(i));
			i = i + 1;
		}

	}

}
