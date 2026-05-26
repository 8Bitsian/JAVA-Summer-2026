/*
  Imani Hollie 05/26/26
  5-Minute Challenge - Take input from a user for their name and age,
  and then print out the values entered.
*/

import java.util.Scanner;

public class J201_1 {
  public static void main(String[] args) {
    // Declare objects
    Scanner input = new Scanner(System.in);
    Person p = new Person();

    // Input & Process
    String name = p.getName(input);
    String age = p.getAge(input);
    
    // Output
    System.out.println("\nYour name: " + name);
    System.out.println("Your age: " + age);
    
    return 0;
  }
}

class Person {
  public String getName(Scanner input) {
    // Declare variable
    String name;
    
    while (true) {
      // Get input
      System.out.print("Please enter your name: ");
      name = input.nextLine().trim();

      // Validate input
      if (name.matches("[a-zA-Z- ]+")) {
        return name;
      } else {
        System.out.println("ERROR: Invalid Input - Name must be characters only (a-z or A-Z)\n");
      }
    }
  }

  public String getAge(Scanner input) {
    // Declare variable
    String age;

    while (true) {
      // Get input
      System.out.println("\nPlease emter your age: ");
      age = input.nextLine().trim();

      // Validate input
      if (age.matches("[0-9]")) {
        return name;
      } else {
        System.out.println("ERROR: Invalid Input - Age must be digits only (0-9)\n");
      }
    }
  }
}
