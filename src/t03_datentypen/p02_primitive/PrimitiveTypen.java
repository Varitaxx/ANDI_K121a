package t03_datentypen.p02_primitive;

public class PrimitiveTypen {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    primtive();
    zahlenSysteme();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void primtive() {
    // Ganzzahlen
    byte b = 127;                  // byte : -128..127
    short s = 32767;               // short: -32768..32767
    int i = 2147483647;            // int: -2147483648..2147483647
    long l = 9223372036854775807L; // long: 9223372036854775808..9223372036854775807
    // =============================================================================
    // Fließkommazahlen
    float  f = 1.23F;
    double d = 1.34;
    // =============================================================================
    char c1 = '#';      // nur ein Zeichen
    System.out.println("c1: " + c1);
    char c2 = '\u1A6F'; // Unicode 0..65535
    System.out.println("c2: " + c2);
    char c3 = 65;       // ASCII Code 0..255
    System.out.println("c3: " + c3);
    // =============================================================================
    boolean anwesend = true; // false
    boolean gerade = ( b > 3 ); // true (b=127 > 3)
  }
  
  private static void zahlenSysteme() {
    int zahl1 = 483;   // Dezimal:     Basis 10 (0..9)
    System.out.println("zahl1: " + zahl1);
    int zahl2 = 0743;  // Oktal:       Basis 8  (0..7)
    System.out.println("zahl2: " + zahl2);
    int zahl3 = 0x1E3; // Hexadezimal: Basis 16 (0..9, A-F)
    System.out.println("zahl3: " + zahl3);
    int zahl4 = 0b111100011; // Binär: Basis 2  (0..1)
    System.out.println("zahl4: " + zahl4);
  }
}
