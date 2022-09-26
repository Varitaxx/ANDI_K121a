package t02_kontrollstrukturen.aufgaben.aufgabe3_weizenkornlegende;

public class Weizenkornlegende {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    version1();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void version1() {
    // Alle Körner auf dem Schachbrett aufzählen
    double summe = 0; // Gesamtanzahl der Körner
    
    // i: Kachelindex // j: Anzahl der Körner auf der aktuellen Kachel
    // i = 1 (1. Kachel) => j = 1 (Korn)
    // i = 2 (2. Kachel) => j = 2 (Körner)
    // i = 3 (3. Kachel) => j = 4 (Körner)
    for (double i = 1, korn = 1 ; i <= 64 ; i++, korn = korn * 2) {
      // i : 1..64
      System.out.println( (int)i + ". Kachel => " + korn + " - Körner");
      summe = summe +  korn;
    }
    System.out.println("Gesamtanzahl der Körner: " + summe);
    // 1.8446744073709552E19 => 18_450_000_000_000_000_000 (18,xxx Trillionen)
  }
  
}
