package t03_deklarationen.aufgaben.aufgabe3D;

public class NotenUmrechnung {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    final int[] PROZENTE = { 95,  89,  85,  81,  77,   73,  69,  65,  60,  55, 50  };
    final double[] NOTEN = {1.0, 1.3, 1.7, 2.0, 2.3 , 2.7, 3.0, 3.3, 3.7, 4.0, 4.3 };
    
    double noteInProzent = 75; // <= ändern und testen
    double schulnote = 5.0;    // Schulnote, die ermittelt werden soll
    
    for (int i = 0; i < PROZENTE.length; i++) {
      if ( noteInProzent >= PROZENTE[i] ) { // PROZENTE[i]: 95,89,85,...
        schulnote = NOTEN[i];
        break;
      }
    }
    System.out.println("Ihre Schulnote: " + schulnote);
    
    System.out.println("======================= end of main() ======================");
  }
  
}
