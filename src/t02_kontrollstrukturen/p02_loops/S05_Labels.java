package t02_kontrollstrukturen.p02_loops;

public class S05_Labels {
  public static void main(String[] args) {
    labelTest();
  }

  // =======================================================================================
  private static void labelTest() {
    System.out.println("========== Outer ==========");
    aussen: // label für eine Schleife
    for( int i = 0 ; i < 3 ; i++ ) {   // 0..2
      System.out.println("==== Inner =====");
      inner:
      for( int j = 0 ; j < 5 ; j++ ) { // 0..4
        if (i + j > 3) {
//          break; // Unterbricht NUR die unmittelbar umgebende Schleife (Schleife mit j)
//          break aussen; // Unterbricht NUR die Schleife mit dem Label "aussen"
//          continue;      // Zur nächsten Iteration der aktuellen Schleife übergehen
          continue aussen; // Zur nächsten Iteration der Schleife "aussen" übergehen
        }
        // %d: Platzhalter für eine Ganzzahl, %n: Zeilenumbruch (Plattform-passend)
        System.out.format("(i=%d,j=%d)%n", i, j);
      }
      System.out.println("=== END of Inner ===");
    }
    System.out.println("======= END of Outer ======");
  // =======================================================================================
  }
}
