package comp110.lecture03;

import comp110.Console;

public class IfThenElseExample {

  public static void main(String[] args) {

    Console console = new Console("if-then-else Example");

    console.print("Which is the lie?");
    // TODO: Fill in your two truths and a lie here
    console.print("1. ");
    console.print("2. ");
    console.print("3. ");
    int correct = 0; // TODO: Change this to be the correct answer

    int guess = console.promptInt("Your guess:");

    // TODO: Add an else block to this if-then statement that tells
    // your friend they are wrong.
    if (guess == correct) {
      console.print("YOU GOT IT!");
    }

    console.print("Game over.");

  }

}