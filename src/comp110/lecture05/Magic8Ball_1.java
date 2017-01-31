package comp110.lecture05;

import java.util.Random;

import comp110.Console;

public class Magic8Ball_1 {

  public static void main(String[] args) {

    Console console = new Console("Magic 8 Ball");
    console.speed(0.5);

    // We will use the following Random object to generate numbers for us.
    Random random = new Random();

    boolean playing = true;

    // TODO A: Open a while loop here that loops while playing is true.

    String question = console.promptString("Ask a yes or no question.");

    console.print("Shaking...");

    int answer = random.nextInt(5);

    if (answer == 0) {
      console.print("It is certain");
    } else if (answer == 1) {
      console.print("Without a doubt");
    } else if (answer == 2) {
      console.print("Most likely");
    } else if (answer == 3) {
      console.print("Reply hazy try again");
    } else if (answer == 4) {
      console.print("Don't count on it");
    } else {
      console.print("Very doubtful");
    }

    // TODO B: Ask if wants to play again here?

    // TODO A: The while loop closing curly brace should end here.

    console.print("Peace.");

  }

}