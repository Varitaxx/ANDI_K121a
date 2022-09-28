package t03_deklarationen.p11_arrays;

import java.util.Arrays;

public class ArrayTest {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    //deklarationInitialisierung();
    //zugriffAufElementeEinesArrays();
    iterationen();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void deklarationInitialisierung() {
    // =============================================================================
    // Deklaration
    // =============================================================================
    int[] einDim1; // 1-dim Array
    int einDim2[]; // Alternative
    // ==========================
    int[][] zweiDim1; // 2-dim Array
    int zweiDim2[][]; // Alternative
    int[] zweiDim3[]; // Alternative
    // =============================================================================
    // Deklaration + Initialisierung
    // =============================================================================
    int[] aArray = null; // Array ist ein Referenztyp
    // ==========================
    // new int[5] => Array der Länge 5: Alle Elemente bekommen den int-Defaultwert: 0
    int[]    bArray = new int[5];    // <=> { 0 , 0 , 0 , 0 , 0 }
    // new String[3] => Array der Länge 3: Alle Elemente bekommen den String-Defaultwert: null
    String[] cArray = new String[3]; // <=> { null, null, null }
    // ==========================
    int[] dArray = {5 , 6 , 7};             // Ein Array der Länge 3
    String[] eArray = { "Peter", "Hans" };  // Ein Array der Länge 2
    // ==========================
    int[] fArray = new int[] {5 , 6 , 7};   // Ein Array der Länge 3
    // int[] gArray = new int[3] {5 , 6 , 7};  // COMPILER-FEHLER: Angabe von Länge + Elemente nicht erlaubt
    // =============================================================================
    // Deklaration + nachträgliche Initialisierung
    // =============================================================================
    int[] hArray; // Deklaration
    //hArray = {5 , 6 , 7}; // COMPILER-FEHLER: nachtr. Init. mit dieser Syntax nicht erlaubt.
    hArray =  new int[] { 5 , 6 , 7 };
    hArray =  new int[3]; // {0,0,0}
  }
  
  private static void zugriffAufElementeEinesArrays() {
    // Länge 3       => index     0   1   2
    /* final */ int[] zahlen = { 40, 50, 60 };
    System.out.println("zahlen[0]: " + zahlen[0]); // 40
    System.out.println("zahlen[1]: " + zahlen[1]); // 50
    zahlen[1] = 88;
    System.out.println("zahlen[1]: " + zahlen[1]); // 88
    //System.out.println("zahlen[3]: " + zahlen[3]); // Laufzeit-FEHLER: ArrayIndexOutOfBoundsException
  }
  
  private static void iterationen() {
    int[] zahlen = {40, 50, 60};
    System.out.println("====================");
    // Ausgabe des ganzen ArrayTest:
    System.out.println("Arrays.toString(zahlen): " + Arrays.toString(zahlen));
    System.out.println("====================");
    System.out.println("zahlen.length: " + zahlen.length);
    System.out.println("====================");
    for( int i = 0 ; i < zahlen.length ; i++ ) {
      System.out.println(zahlen[i]);
    }
    System.out.println("====================");
    for( int zahl : zahlen ) {
      System.out.println(zahl);
    }
    System.out.println("====================");
    
    // Funktionale Programmierung (KEIN Prüfungsthema)
    System.out.println(zahlen);
    // Arrays.stream(zahlen).forEach(System.out::println);
  }
  
}
