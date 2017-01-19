package comp110.lecture02;

import comp110.Console;

public class UserInput {

  public static void main(String[] args) {
    Console console = new Console("User Input");

    int age; // Declaration
    age = 10; // Initialization

    console.print("You are");
    console.print(age);
    
    int yearsUntil100 = 100 - age;
    console.print("You will be 100 in");
    console.print(yearsUntil100);
    console.print("years");
  }

}