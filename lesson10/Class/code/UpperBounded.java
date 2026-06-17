import java.util.ArrayList;

class Pair<T> {
    T var1, var2;
    Pair(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    // Upper-bounded generic method
    public <N extends Number> void print(N[] arr) {
        for (N num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class UpperBounded {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("Apple", "Banana");

        Integer[] intArr = {1, 2, 3};
        Double[]  dblArr = {1.1, 2.2, 3.3};
        Long[]    lngArr = {100L, 200L, 300L};
        String[]  strArr = {"hi", "bye"};

        p.print(intArr);  // OK
        p.print(dblArr);  // OK
        p.print(lngArr);  // OK

        //p.print(strArr); // ❌ Compile-time error
    }
}