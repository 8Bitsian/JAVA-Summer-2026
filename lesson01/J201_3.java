/*
  Imani Hollie 05/26/26
  5-Minute Challenge - Repeat the process from J102_2.java until the
  user enters -1 as a sentinel value
*/

import java.util.Scanner;

public class J201_1 {
  public static void main(String[] args) {
    // Declare objects
    Scanner input = new Scanner(System.in);
    Person p = new Person();

    while (true) {
      // Input & Process
      String name = p.getName(input);
      if (name.equals("-1")) break;
      String age = p.getAge(input);
      if (age.equals("-1")) break;

      // Output
      System.out.println("\nYour name: " + name);
      System.out.println("Your age: " + age);
      System.out.println();
    }
  }
}

class Person {
  public String getName(Scanner input) {
    // Declare variable
    String name;
    
    while (true) {
      // Get user input
      System.out.print("Enter Name (-1 to Exit): ");
      name = input.nextLine().trim();

      // Check for sentinel
      if (name.equals("-1")) return "-1";

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
      // Get user input
      System.out.println("\nEnter Age (-1 to Exit): ");
      age = input.nextLine().trim();

      // Check for sentinel
      if (age.equals("-1")) return "-1";

      // Validate input
      if (age.matches("[0-9]")) {
        return name;
      } else {
        System.out.println("ERROR: Invalid Input - Age must be digits only (0-9)\n");
      }
    }
  }
}
