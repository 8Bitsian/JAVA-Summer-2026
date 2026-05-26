/*
  Imani Hollie 05/26/26
  5-Minute Challenge - Calculate the sum of the following series of numbers:
  10 + 12 + 14 + 16 + 18 + ___ + 100
*/

public class J201_1 {
  public static void main(String[] args) {
    // Process
    int sum = 0;
    for (int i = 10; i <= 100; i += 2)
      sum += i;
    
    // Output
    System.out.println(sum);
    return 0;
  }
}
