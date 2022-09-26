package t01_grundlagen.p13_typumwandlung;

public class Typumwandlung {
  public static void main(String[] args) {
    // ==========================================>
    // byte, short/char, int, long, float, double
    // ==========================================>
    byte byteVar = 90;
    short shortVar = 500;
    char charVar = '#';
    System.out.println("charVar: " + charVar);
    System.out.println("charVar: " + (int) charVar);
    int intVar = 12;
    long longVar = 5;
    float floatVar = 3.2f;
    double doubleVar = 1.8;
    // ===================================
    System.out.println("########################################");
    System.out.println("###### Automatische Typausweitung ######");
    System.out.println("########################################");
    intVar = shortVar; // OK: Automatische Typausweitung
    intVar = byteVar;  // OK
    intVar = charVar;  // OK
    longVar = intVar;  // OK
    // ### Automatische Typausweitung, aber mit möglichen Verlusten
    floatVar = intVar;   // OK, aber Verluste möglich
    floatVar = longVar;  // OK, aber Verluste möglich
    doubleVar = longVar; // OK, aber Verluste möglich

    System.out.println("########################################");
    System.out.println("### Explizite Typeinengung (CASTING) ###");
    System.out.println("########################################");
    // Bei Casting sind Verluste immer möglich!!!
    byteVar = (byte) intVar; // Explizite Typeinengung (sonst Compiler-Fehler)
    shortVar = (short) intVar;
    shortVar = (short) longVar;
    intVar = (int) longVar;
    intVar = (int) floatVar;
    intVar = (int) doubleVar;
    floatVar = (float) doubleVar;
    // Verluste möglich
    longVar = (long) doubleVar;
    longVar = (long) floatVar;
    floatVar = (float) doubleVar;
    // ########################################
    int a = 200;
    System.out.println("a: " + a);
    int b = (byte) a;
    System.out.println("(byte) a: " + b);

    if (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
      // ...
    }




  }
}
