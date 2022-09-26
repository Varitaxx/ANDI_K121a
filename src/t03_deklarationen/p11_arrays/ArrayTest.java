package t03_deklarationen.p11_arrays;

import java.util.Arrays;

public class ArrayTest {
  static int[] iArray; // Defaultwert = null;
  static int a; // 0

  public static void main(String[] args) {
    deklarationInitialisierung();
//    zugriffAufElementeEinesArrays();
//    iterationen();
  }

  private static void deklarationInitialisierung() {
    // =============================================
    // Deklaration
    // =============================================
    int[] xArray;  // Viel häufiger zu sehen
    int yArray[];  // Möglich aber ungewöhnlich

    // =============================================
    // Deklaration + Initialisierung
    // =============================================

    int[] aArray = null; // Array ist ein Referenztyp

    // new int[5] => Array der Länge 5: Alle Elemente bekommen den int-Defaultwert 0
    int[] bArray = new int[5];  // <=> {0, 0, 0, 0, 0}
    String[] str1Array = new String[2]; // <=> {null, null}

    int[] cArray = {5, 6, 7};               // Ein Array der Länge 3
    String[] str2Array = {"Peter", "Hans"}; // Ein Array der Länge 2

    int[] dArray = new int[]{5, 6, 7};      // Ein Array der Länge 3
//    int[] eArray = new int[3] {40, 50, 60}; // COMPILER-FEHLER: Angabe von Länge + Elemente nicht erlaubt
    // =============================================
    // Deklaration und nachträgliche Initialisierung
    // =============================================
    int[] fArray;
    // fArray = {5, 6, 7}; // COMPILER-FEHLER
    fArray = new int[]{5, 6, 7}; // Nachträgliche Initialisierung geht NUR mit dem new-Operator
    fArray = new int[4]; // {0, 0, 0, 0}
  }

  private static void zugriffAufElementeEinesArrays() {
    // Länge 3   => index  0   1   2
    final int[] zahlen = {40, 50, 60};
    // zahlen = new int[10]; // FEHLER, da zahlen "final" ist
    System.out.println("zahlen[0]: " + zahlen[0]); // 40
    System.out.println("zahlen[1]: " + zahlen[1]); // 50
    zahlen[1] = 88; // OK !!!
    System.out.println("zahlen[1]: " + zahlen[1]);
    System.out.println("zahlen[3]: " + zahlen[3]); // FEHLER: ArrayIndexOutOfBoundsException
  }

  private static void iterationen() {
    int[] zahlen = {40, 50, 60};
    System.out.println("====================");
    // Ausgabe des ganzen Arrays:
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
//    Arrays.stream(zahlen).forEach(System.out::println);
  }
}
