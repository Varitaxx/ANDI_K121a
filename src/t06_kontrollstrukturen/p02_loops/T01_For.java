package t06_kontrollstrukturen.p02_loops;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T01_For {
  
  public static void main( String[] args ) {
    
    //forStandard1();
        endlosSchleife();
    //    arrayTest();
    //    verschachtelt();
    //    forEach1();
    //    forEach2();
    System.out.println("=== END ===");
  }
  
  private static void forStandard1() {
    System.out.println("=== for loop ===");
    // for (<Initialanweisung> ; <Iterationsbedingung>; <Fortschrittsanweisungen>) {
    // Initialanweisung       : 1x zu Beginn
    // Iterationsbedingung    : VOR jeder Iteration geprüft
    // Fortschrittsanweisungen: NACH jeder Iteration
    for( int i = 0  ;  i < 3 ; i++ ) {
      System.out.println(i);
    }
    
    System.out.println("Nach der Schleife");
    
    
    //int a = 0, b = 5; // zulässig
    //// ##########################################################
    for( int i = 0, j = 5 ; i < 10 && j < 15 ; i++ , j = j + 2 ) {
      // ...
    }
  }
  
  private static void endlosSchleife() {
    for (;;) {
      System.out.println(LocalTime.now());
    }
  }
  
  private static void arrayTest() {
    // Indizes:     0   1   2   3
    int[] zahlen = { 72, 4, 63, 105 }; // Ein Array der Länge 4 ==> Indizes [0..3]
    for( int i = 0 ; i < zahlen.length ; i++ ) {
      System.out.println(zahlen[i]);
    }
    
  }

  private static void arrayListTest() {
    List<Integer> zahlen = Arrays.asList(72, 4, 63, 105 );
    for( int i = 0 ; i < zahlen.size(); i++ ) {
      System.out.println(zahlen.get(i));
    }
  }
  
  private static void verschachtelt() {
    for( int i = 0 ; i < 3 ; i++ ) {  // i = 0..2
      System.out.println(i);
      for( int j = 0 ; j < 5 ; j++ ) {
        System.out.format("(i=%d, j=%d)%n", i, j); // (0,0)
      }
    }
    //    System.out.println(i); // Compiler-Fehler: i ist hier nicht sichtbar
  }
  
  private static void forEach1() {
    int[] zahlen = { 72, 4, 63, 105 };
    // Kein Index, NUR Vorwärts, ALLE Elemente werden iteriert
    for( int zahl : zahlen ) { // Enhanced for loop (foreach)
      //      if (zahl % 2 == 0)
      System.out.println(zahl);
    }
  }
  
  private static void forEach2() {
    ArrayList<String> namen = new ArrayList<>();
    namen.add("Peter");
    namen.add("Hans");
    namen.add("Thomas");
    for( String name : namen ) {
      System.out.println(name);
    }
  }
  
  
}
