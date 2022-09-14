package t03_datentypen.p05_methoden.p03_methoden_aufruf;


import java.util.Random;

public class S02_MethodenAufrufe {
  
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    //methode1();          // Methodenaufruf
    // =============================================================================
    //methode2( "Peter" ); // Methodenaufruf
    // =============================================================================
    //int zahl = methode3() + 10_000;  // methode3(): Das ist ein Ausdruck und hat einen Datentypen "int"
    //System.out.println("zahl: " + zahl);
    // =============================================================================
    int summe = methode4(2, 3);       // methode4(...): Das ist ein Ausdruck und hat einen Datentypen "int"
    System.out.println("Summe: " + summe);
    System.out.println("======================= end of main() ======================");
  }
  
  // ===============================================================================
  public static int methode4( int a, int b) {
    System.out.println("===> int methode4(int, int) in Action ...");
    return a + b; // Summenbildung
  }
  // ===============================================================================
  public static int methode3( ) {
    System.out.println("===> int methode3() in Action ...");
    //Random rd = new Random();
    //int generatedNumber = rd.nextInt(100) + 1; // 1..100
    //return generatedNumber;
    return new Random().nextInt(100) + 1; // Alternative zu den 3 vorherigen Anweisungen
  }
  // ===============================================================================
  public static void methode2( String name ) {
    System.out.println("===> void methode2(String) in Action ...");
    System.out.println("Hallo " + name + "!");
  }
  // ===============================================================================
  public static void methode1() {  // Methodendeklaration
    System.out.println("===> void methode1() in Action ...");
  }
  // ===============================================================================





}
