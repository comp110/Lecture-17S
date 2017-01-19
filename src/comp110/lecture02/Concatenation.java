package comp110.lecture02;

import comp110.Console;

public class Concatenation {

  public static void main(String[] args) {

    Console console = new Console("String Concatenation Examples");
    console.speed(0.5);

    // When the + symbol is used on a String, it "concatenates" or conjoins
    // two String values into a single String value.
    console.print("This" + "is" + "String" + "concatenation");

    String firstName, lastName, fullName;

    firstName = "Theo";
    lastName = "Pinson";
    fullName = firstName + " " + lastName;
    console.print(fullName);

    console.print("What is your name?");
    firstName = console.promptString("First Name:");
    lastName = console.promptString("Last Name:");

    // TODO
    fullName = firstName + " " + lastName;
    console.print("You entered " + fullName);

  }

}
