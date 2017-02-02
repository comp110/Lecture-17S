package comp110.lecture06;

import comp110.Console;

public class SumVariables {

  public static void main(String[] args) {

    Console console = new Console("Sum Variables Example");

    int length = console.promptInt("How many numbers do you want to add? (2 or 3)");

    if (length == 2 || length == 3) {

      int x = 0;
      int y = 0;
      int z = 0;

      x = console.promptInt("x = ");
      y = console.promptInt("y = ");

      if (length == 3) {
        z = console.promptInt("z = ");
      }

      // TODO: replace 0 with an integer expression
      // which adds up x, y, and z.
      int sum = 0;

      console.print("The sum is " + sum);

    } else {
      console.alert("Sorry, this powerful app can only sum 2 OR 3 numbers.");
    }

    console.alert("Have a nice day.");

  }
}