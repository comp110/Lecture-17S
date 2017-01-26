package comp110.lecture04;

import comp110.Console;

public class StringExamples {

	public static void main(String[] args) {

		Console console = new Console("String Method Examples");
		console.speed(0.6);

		while (true) {

			console.print("1. String's boolean Test Methods");
			console.print("2. String's comparison Methods");
			console.print("3. String's index-related Methods");
			console.print("4. String manipulation Methods");

			int choice = console.promptInt("Your choice:");

			if (choice == 1) {
				console.print("hi".equals("hi"));
				console.print("hi".equalsIgnoreCase("HI"));
				console.print("hello world".contains("ello"));
				console.print("hello".startsWith("hell"));
				console.print("hello".endsWith("ello"));
			} else {
				if (choice == 2) {
					console.print("abc".compareTo("xyz"));
					console.print("abc".compareToIgnoreCase("ABC"));
				} else {
					if (choice == 3) {
						console.print("the length of this string is".length());
						console.print("hello world".substring(1, 8));
						console.print("hello".charAt(3));
						console.print("hello world".indexOf("o"));
						console.print("hello world".lastIndexOf("o"));
					} else {
						console.print("one" + "concatenated with" + "another");
						console.print("hehehehe".replace("e", "a"));
						console.print("hehehehe".replaceAll("e", "a"));
						console.print("chAnge Case uP".toUpperCase());
						console.print("chAnge Case doWn".toLowerCase());
					}
				}
			}
		}

	}

}