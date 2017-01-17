package comp110.lecture01;

import comp110.Console;

public class Variables {

  public static void main(String[] args) {

    Console console = new Console("Variable Examples");
    console.speed(0.3); // Forces console to slow down output!

    // Variable Declaration - declares a variable exists

    // Variable Initialization - is the *first* assignment to a variable

    // Variable Access - read the value stored in a variable
    console.print("Starting Savings:");

    // Variable Declaration and Initialization
    console.print("Interest:");

    // Variable Assignment - allows you to *change* a variable's value
    console.print("Savings after 1 year of compound interest:");

    console.print("Savings after 2 years of compound interest:");

  }

}