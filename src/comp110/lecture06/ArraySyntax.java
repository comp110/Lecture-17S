package comp110.lecture06;

import comp110.Console;

public class ArraySyntax {

	public static void main(String[] args) {
		Console console = new Console("Array Syntax");

		// 1. Array Declaration & Construction
		String[] words = new String[2];

		// 2. Access # of elements in an array with the array's length field
		console.print(words.length);

		// 3. Element Initialization / Assignment
		words[0] = "Hello";
		words[1] = "World";

		// 4. Element Access
		console.print("words[0]: " + words[0]);
		console.print("words[1]: " + words[1]);

	}

}
