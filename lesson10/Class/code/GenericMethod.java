import java.util.ArrayList;

class Pair<T> {
    T var1, var2;

    Pair(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    // Uses class-level T
    public void mT(T var3) {
        System.out.println(var1 + " & " + var2 + ": " + var3);
        System.out.println("Same type? " + (var1.getClass() == var3.getClass()));
        System.out.println("--------------------------------------");
    }

    // Generic method
    public <S> void mS(S var3) {
        System.out.println(var1 + " & " + var2 + ": " + var3);
        System.out.println("Same type? " + (var1.getClass() == var3.getClass()));
        System.out.println("--------------------------------------");
    }
}

public class GenericMethod {
     public static void main(String[] args) {
        // Create Pair object (T = String)
        Pair<String> p = new Pair<>("Apple", "Banana");

        p.mT("Cherry");   // OK (same type as T = String)
        // p.mT(99);      // ERROR

        // Generic method
        p.mS("Cherry");   // OK
        p.mS(99);         // OK
        p.mS(3.14);       // OK

    }
}
