package t01_grundlagen.p11_operatoren;

public class S02_Vergleichsoperatoren {
  public static void main(String[] args) {
    // ==   !=   <   <=   >   >=
    int a = 10;
    int b = 5;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("=====================");
    System.out.println("a < 20 : " + (a < 20));  // true
    System.out.println("a < b  : " + (a < b));   // false
    System.out.println("a == b : " + (a == b));  // false
    System.out.println("a != b : " + (a != b));  // true
    System.out.println("a >= 10: " + (a >= 10)); // true


  }
}
