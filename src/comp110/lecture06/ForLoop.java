package comp110.lecture06;

import comp110.Console;

public class ForLoop {

  public static void main(String[] args) {

    Console console = new Console("For Loop Conversion");

    // The following line illustrates array initialization shortcut syntax
    String[] words = new String[] { "hello", "world", "!!!" };

    console.print("while loop example:");
    int i = 0;
    while (i < 4) {
      console.print(i);
      i = i + 1;
    }

    // TODO: Write the above while loop as a for loop below

  }

}
