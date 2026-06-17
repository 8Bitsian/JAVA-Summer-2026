/*Class activity
Create a generic print method to print values of different types                                     that can print values of different types:
        7
        3.14
        “Hello, world!”
*/

public class ClassActivity {

    // Generic method
    public static <T> void print(T value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        print(7);               // Integer
        print(3.14);            // Double
        print("Hello, world!"); // String
    }
}

