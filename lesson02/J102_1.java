/*
  Imani Hollie 05/26/26
  5-Minute Challenge - Create a Rectangle class by inheriting from the Shape class
  Sample Output:
  Width: ***
  Height: ***
  Area: ***
*/

import java.util.Scanner;

public class J202_1 {
     static void main() {
        // Declare objects
        Scanner input = new Scanner(System.in);

        while (true) {
            // Input (Get width and height of a rectangle)
            System.out.print("\nEnter Width: ");
            double width = input.nextDouble();

            System.out.print("Enter Height: ");
            double height = input.nextDouble();

            // Process (Create rectangle object as a subset of Shape)
            Rectangle rectangle = new Rectangle(width, height);

            // Output
            System.out.println("\nWidth: " + width);
            System.out.println("Height: " + height);
            System.out.println("Area: " + rectangle.area());
        }
    }
}

class Shape {
    private final String creator;

    public Shape(String creator) { this.creator = creator; }

    public String getName() { return creator; }

    public double area() {
        System.out.println("Write code to calculate the area for each shape");
        return 0.0; // Default implementation
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
