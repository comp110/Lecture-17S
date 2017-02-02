package comp110.lecture06;

import comp110.Console;

public class SumArray {

	public static void main(String[] args) {

		Console console = new Console("Sum Array Example");

		int length = console.promptInt("How many numbers do you want to add?");

		int[] a = new int[length];

		for (int i = 0; i < a.length; i = i + 1) {
			a[i] = console.promptInt("a[" + i + "] = ");
		}

		// TODO: sum all the elements of array a
		int sum = 0;
		for (int i = 0; i < a.length; i = i + 1) {
			sum = sum + a[i];
		}

		console.print("The sum is " + sum);

	}

}
