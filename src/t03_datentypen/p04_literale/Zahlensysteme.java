package t03_datentypen.p04_literale;

public class Zahlensysteme {
  public static void main(String[] args) {
    int a = 1_000_000_000; // Unterstrich: erhöht die Lesbarkeit
    // ======================== Zahlensysteme für Ganzzahlen ====================
    // keine führende 0          ==> Dezimalzahl
    // eine führende  0          ==> Oktalzahl
    // eine führende  0x oder 0X ==> Hexadezimalzahl
    // eine führende  0b oder 0B ==> Binärzahl
    // ==========================================================================
    int zahl1 = 439;  // Dezimal: Basis 10 => jede Stelle hat 10 verschiedene Werte 0..9
    System.out.println("zahl1         (439): " + zahl1);
    System.out.println("=========================================================");
    int zahl2 = 0667; // Oktal: Basis 8 =>  jede Stelle hat 8 verschiedene Werte 0..7
    System.out.println("zahl2        (0667): " + zahl2);
    System.out.println("=========================================================");
    //      256  16   1
    // 0X    1    B   7
    int zahl3 = 0X1B7; // Hexadezimal: Basis 16 => jede Stelle hat 16 verschiedene Werte 0..9 A..F
    System.out.println("zahl3       (0X1B7): " + zahl3);
    System.out.println("=========================================================");
    int zahl4 = 0B1_1011_0111;
    System.out.println("zahl4 (0B110110111): " + zahl4); // Binär: Basis 2 => jede Stelle hat 2 verschiedene Werte 0..1
    System.out.println("=========================================================");
    System.out.println("Integer.toHexString(439): " + Integer.toHexString(439));
    System.out.format("%h%n", 439);
    System.out.println("=========================================================");
    System.out.println("Long.toHexString(4399999999999L): " + Long.toHexString(4399999999999L));
    System.out.println("=========================================================");
  }
}
