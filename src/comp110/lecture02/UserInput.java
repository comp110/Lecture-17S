package comp110.lecture02;

import comp110.Console;

public class UserInput {

  public static void main(String[] args) {
    Console console = new Console("User Input");

    int x;
    double y;
    String z;

    // TODO: Prompt user for values
    x = console.promptInt();
    y = console.promptDouble();
    z = console.promptString();

    console.print("You entered: ");
    console.print(x);
    console.print(y);
    console.print(z);

  }

}