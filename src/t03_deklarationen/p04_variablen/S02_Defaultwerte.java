package t03_deklarationen.p04_variablen;

public class S02_Defaultwerte {
  // Nicht-Lokale (Top-Level) Variablen
  // Egal, ob static oder non-static !!!
  // Primitive Datentypen
  static int  intVar;        // Defaultwert 0      (byte, short, int, long)
  static double doubleVar;   // Defaultwert = 0.0  (float)
  static char charVar;       // Defaultwert = '\0'
  static boolean booleanVar; // Defaultwert = false
  // Referenztypen: String, Person, Cloneable, ...:
  static String stringVar;   // Defaultwert = null
  static int[] arrayVar;     // Defaultwert = null
  
  public static void main(String[] args) {
    // =============================================================================
    // Lokale Variablen haben keine Defaultwerte
    int zahl;
    //System.out.println("zahl: " + zahl); // COMPILER-FEHLER
    // =============================================================================
    System.out.println("intVar    : " + intVar);
    System.out.println("doubleVar : " + doubleVar);
    System.out.println("charVar   : " + charVar);
    System.out.println("booleanVar: " + booleanVar);
    System.out.println("===========================");
    System.out.println("stringVar : " + stringVar);
    System.out.println("===========================");
    System.out.println("arrayVar  : " + arrayVar);
    System.out.println("===========================");
  }
}
