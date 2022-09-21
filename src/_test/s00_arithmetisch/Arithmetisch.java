package _test.s00_arithmetisch;

import java.util.Scanner;

public class Arithmetisch {
  
  public static void main( String[] args ) {
    //arithmetischeOperationen();
    Pythagoras();
  
    System.out.println("============================================================");
  }
  
  private static void Pythagoras() {
    // Satz des Pythagoras: c² = a² + b² => c = quadratWurzel(a² + b²)
    // Gegeben sind die Kanten eines rechtwinkligem Dreieck => Hypotenuse c berechnen
    int a = 12, b = 5; // Umstellung auf Benutzereingabe mit Scanner ist eine einfache Fleißarbeit
    double c = Math.sqrt( a * a + b * b );
    System.out.println("Hypotenuse: " + c);
  }
  
  private static void arithmetischeOperationen() {
    // Der Benutzer gibt zwei Zahlen ein.
    // Das Programm berechnet Summe/Differenz/Produkt/Teilung/Modulo.
    //int zahl1 = 5; // Erste Lösung ohne Benutzereingabe
    //int zahl2 = 2;
    
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Geben Sie die erste Zahl ein:");
    int zahl1 = myScanner.nextInt();
    System.out.println("Geben Sie die zweite Zahl ein:");
    int zahl2 = myScanner.nextInt();
    System.out.println("============================================================");
    System.out.println("zahl1: " + zahl1);
    System.out.println("zahl2: " + zahl2);
    System.out.println("============================================================");
    System.out.println( "Summe    : " + (zahl1 + zahl2) );
    System.out.println( "Differenz: " + (zahl1 - zahl2) );
    System.out.println( "Produkt  : " + zahl1 * zahl2  );
    System.out.println( "Teilung  : " + zahl1 / zahl2  );
    System.out.println( "Modulo   : " + zahl1 % zahl2  );
    System.out.println("============================================================");
  }
  
}
