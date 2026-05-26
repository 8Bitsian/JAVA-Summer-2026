/*
  Imani Hollie 05/26/26
  5-Minute Challenge - Create a Rectangle class by inheriting from the Shape class
  and write a code to show the area of a rectangle.
  Sample Outut:
  Width: ***
  Height: ***
  Area: ***
*/

import java.util.Scanner;

public class J201_1 {
  public static void main(String[] args) {
    // Declare objects
    Scanner input = new Scanner(System.in);

    while (true) {
      // Input
      String value = getValue(input);
      if (value.equals("X")) break;

      // Process
      Rectangle r = new Rectangle(width, height);
      
      // Output
      System.out.println("\nWidth: " + width);
      System.out.println("Height: " + height);
      System.out.println("Area: " + r.area);
      System.out.println();
    }
  }

  
}

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



class Shape {
  private String creator;
  
  public Shape(String creator)
    this.creator = creator;

  public String getName()
    return creator;

  public double area() {
    System.out.println("Write code to calculate the area for each shape.");
    return 0.0;  // Default implementation
  }
}

class Rectangle {
  double width, height;

  public Rectangle(double width, double height) {
    
  }

  public double area() {
    
  }
}
