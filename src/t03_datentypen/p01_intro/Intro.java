package t03_datentypen.p01_intro;

public class Intro {
  // Nicht-Lokale Variablen haben immer einen Defaultwert
  // =================================================
  int a;    // Defaultwert 0 (byte, short, int, long)
  double d; // Defaultwert 0.0 (float, double)
  char c;   // Defaultwert \0
  boolean cond; // Defaultwert false
  // =================================================
  String str; // Defaultwert null (für alle Referenztypen)
  // =================================================
  public static void main( String[] args ) {
    System.out.println("============================================================");
    // Datentypen: Variablen (Parameter), Rückgabetyp von Methoden, Typparameter
    int zahl = 12;
    System.out.println("======================= end of main() ======================");
  }
  
  // ===============================================================================
  public Intro( String str) { /* Konstruktor */ } // Intro myIntro = new Intro("Hallo");
  // ===============================================================================
  public static int summe(int a, int b) {         // int ergebnis = summe(zahl, 3);
    return a + b;
  }
  // ===============================================================================
}
