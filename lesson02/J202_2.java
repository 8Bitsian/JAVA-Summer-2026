/*
  Imani Hollie 05/26/26
  Lab Directions - Write a program to generate an output like the sample output, which verifies the functionality of the classes.
  Create classes based on the UML class diagram:

  SHAPE
  -creator: String
  +Shape(creator: String)
  +getName(): String
  +area(): double

  CIRCLE (Subclass of SHAPE)
  -radius: double
  +Circle(creator: String, radius: double)
  +getRadius(): double
  +area(): double
  +toString(): String

  RECTANGLE (Subclass of SHAPE)
  -width: double
  -height: double
  +Rectangle(width: double, height: double)
  +Rectangle(creator: String, width: double, height: double)
  +getWidth(): double
  +getHeight(): double
  +area(): double
  +toString(): String

  SQUARE (Subclass of RECTANGLE)
  -side: double
  +Square(side: double)
  +Square(creator: String, side: double)
  +getSide(): double
  +area(): double
  +toString(): String

  Sample Snippet:
  String creator = "Your Name";
  Circle circle = new Circle(creator, 10);
  System.out.print(circle.toString());
  System.out.print("===========================");
  Rectangle rectangle = new Rectangle(creator, 5, 2);
  System.out.print(rectangle.toString());
  System.out.print("===========================");

  Sample Output:
  Circle created by Sam
  Radius : **.* cm
  Area   : **.** cm^2
  ===========================
  Rectangle created by Sam
  Width  : **.* cm
  Height : **.* cm
  Area   : **.** cm^2
  ===========================
  Square created by Sam
  Side   : **.* cm
  Area   : **.** cm^2
  ===========================
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class J202_2 {
    public static void main(String[] args) {
        // Declare objects/variables
        Scanner input = new Scanner(System.in);

        while (true) {
            // Input (Get user's name)
            System.out.print("Enter your name: ");
            String creator = input.nextLine().trim();

            // Check for sentinel
            if (creator.equalsIgnoreCase("X")) break;

            // Declare Shape object (for name and area)
            Shape s = new Shape(creator);

            // Output
            System.out.println("\nShapes created by " + s.getName() + "\n");

            // Circle
            double radius;
            try {
                System.out.print("Enter radius: ");
                radius = input.nextDouble();
                s = new Circle(creator, radius);
                System.out.println(s.toString());
                System.out.println("================\n");
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid Input - Exiting Program.");
                break;
            }

            // Rectangle
            double width, height;
            try {
                System.out.print("Enter width: ");
                width = input.nextDouble();
                System.out.print("Enter height: ");
                height = input.nextDouble();
                s = new Rectangle(creator, width, height);
                System.out.println(s.toString());
                System.out.println("================\n");
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid Input - Exiting Program.");
                break;
            }

            // Square
            double side;
            try {
                System.out.print("Enter side: ");
                side = input.nextDouble();
                s = new Square(creator, side);
                System.out.println(s.toString());
                System.out.println("================\n");
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid Input - Exiting Program.");
                break;
            }
        }
        input.nextLine();
        System.out.println("\nExiting Program...");
        
        input.close();
    }
    
    /*
    void getName(String input) { }
    void makeCircle(String input) { }
    void makeRectangle(String input) { }
    void makeSquare(String input) { }
    */
}

class Shape {
    // - creator: String
    private final String creator;

    // + Shape(creator: String)
    public Shape(String creator) { this.creator = creator; }

    // + getName(): String
    public String getName() { return creator; }

    // + area(): double
    public double area() { return 0.0; }
}

class Circle extends Shape { // Subclass of Shape
    // - radius: double
    private final double radius;

    // + Circle(creator: String, radius: double)
    public Circle(String creator, double radius) {
        super(creator);
        this.radius = radius;
    }

    // + getRadius(): String
    public double getRadius() { return radius; }

    // + area(): double
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // + toString(): String
    @Override
    public String toString() {
        return "Circle created by " + getName()
                + "\nRadius : " + getRadius() + " cm"
                + "\nArea   : " + area() + " cm^2";
    }
}

class Rectangle extends Shape { // Subclass of Shape
    // - width, height: double
    private final double width;
    private final double height;

    // + Rectangle(creator: String, width: double, height: double)
    public Rectangle(String creator, double width, double height) {
        super(creator);
        this.width = width;
        this.height = height;
    }

    // + getWidth(): double
    public double getWidth() { return width; }

    // + getHeight(): double
    public double getHeight() { return height; }

    // + area(): double
    @Override
    public double area() {
        return width * height;
    }

    // + toString(): String
    @Override
    public String toString() {
        return "Rectangle created by " + getName()
                + "\nWidth  : " + getWidth() + " cm"
                + "\nHeight : " + getHeight() + " cm"
                + "\nArea   : " + area() + " cm^2";
    }
}

class Square extends Rectangle { // Subclass of Rectangle
    // - side: double
    private final double side;

    // + Square(creator: String, side: double)
    public Square(String creator, double side) {
        super(creator, side, side);
        this.side = side;
    }

    // + getSide(): double
    public double getSide() { return side; }

    // + area(): double
    @Override
    public double area() {
        return side * side;
    }

    // + toString(): String
    @Override
    public String toString() {
        return "Square created by " + getName()
                + "\nSide   : " + getSide() + " cm"
                + "\nArea   : " + area() + " cm^2";
    }
}
