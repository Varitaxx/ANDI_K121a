package t01_grundlagen.p11_operatoren;

public class S01_ArithmetischeOperatoren {
  public static void main(String[] args) {
    // * /    %    + -
    int a = 3;
    int b = 5;

    System.out.println("##########################################");

    System.out.println("a: " + a );
    System.out.println("b: " + b);

    System.out.println("##########################################");
    int res = a + b;
    System.out.println("a + b: " + res);
    System.out.println("##########################################");

    res = a + b * 2;
    System.out.println("a + b * 2: " + res);

    System.out.println("##########################################");

    res = (a + b) * 2;
    System.out.println("(a + b) * 2: " + res);
    System.out.println("##########################################");
    // ##### Pre-Inkrement/Dekrement, Post-Ikrement/Dekrement
    a = 10; // b = 5
    res = a++ + b;  // Post-Increment <=> res = a + b; a = a + 1;
    System.out.println("res: " + res); // 15
    System.out.println("a: " + a);     // 11
    System.out.println("##########################################");

    a = 10; // b = 5
    res = ++a + b;  // Pre-Increment  <=> a = a + 1; res = a + b;
    System.out.println("res: " + res); // 16
    System.out.println("a: " + a);     // 11
    System.out.println("##########################################");
    // Teilung von n durch 2³ <=> n >> 3
    System.out.println("48 / 8 : " + 48 / 8);      // 6
    System.out.println("48 >> 3: " + (48 >> 3));   // 6 = 48 / 2³
    // Produkt von n und 2³ <=> n << 3
    System.out.println("6 * 8  : " + 6 * 8);       // 48
    System.out.println("6 << 3 : " + (6 << 3));    // 48 = 6 * 2³
  }
}
