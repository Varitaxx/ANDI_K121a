package t04_t05_operatoren;

public class S08_Typumwandlung {
  public static void main(String[] args) {
    // <==========================================
    // <=    Groß    ====================   Klein
    // double, float, long, int, short/char, byte
    // <==========================================
    byte byteVar = 90;
    short shortVar = 500;
    char charVar = '=';
    System.out.println("charVar: " + charVar);
    System.out.println("charVar: " + (int) charVar);
    int intVar = 12;
    long longVar = Long.MAX_VALUE;
    float floatVar = 3.2f;
    double doubleVar = 1.8;
    // ===================================
    System.out.println("========================================");
    System.out.println("====== Automatische Typausweitung ======");
    System.out.println("========================================");
    intVar = byteVar;  // OK: Automatische Typausweitung
    intVar = shortVar; // OK
    intVar = charVar;  // OK
    // ===================================
    //longVar = intVar;   // OK
    // === Automatische Typausweitung, aber mit möglichen Verlusten
    floatVar = intVar;   // OK, aber Verluste möglich
    floatVar = longVar;  // OK, aber Verluste möglich
    // ===================================
    doubleVar = longVar; // OK, aber Verluste möglich
    System.out.println("========================================");
    System.out.println("=== Explizite Typeinengung (CASTING) ===");
    System.out.println("========================================");
    // double, float, long, int, short/char, byte
    // ======================
    // intVar = floatVar; // COMPILER-FEHLER
    // ======================
    intVar = (int) floatVar; // Explizite Typeinengung (CASTING)
    // ======================
    // Bei Casting sind Verluste immer möglich!!!
    byteVar = (byte) intVar; // Explizite Typeinengung (sonst Compiler-Fehler)
    shortVar = (short) intVar;
    shortVar = (short) longVar;
    // ======================
    intVar = (int) longVar;
    intVar = (int) floatVar;
    intVar = (int) doubleVar;
    // ======================
    longVar = (long) doubleVar;
    longVar = (long) floatVar;
    // ======================
    floatVar = (float) doubleVar;
    // ========================================
    int a = 200;
    System.out.println("a       : " + a);
    byte b = (byte) a;
    System.out.println("(byte) a: " + b);
  }
}
