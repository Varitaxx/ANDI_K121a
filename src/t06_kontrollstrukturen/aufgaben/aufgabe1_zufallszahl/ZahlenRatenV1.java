package t06_kontrollstrukturen.aufgaben.aufgabe1_zufallszahl;


import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenV1 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    // Es soll eine Zahl zwischen 1 und 100 generiert werden
    // Diese Zahl wird vom Benutzer erraten
    rateZahl();
    System.out.println("======================= end of main() ======================");
  }
  
  public static void rateZahl() {
    //===========================================
    // Einmalig eine Zufallszahl generieren
    //===========================================
    Random rd = new Random();
    // int zuErraten = rd.nextInt(100); // 0..99
    int zuErraten = rd.nextInt(100) + 1; // 1..100
    //System.out.println(zuErraten);
    //===========================================
    // Benutzereingabe
    //===========================================
    Scanner myScanner = new Scanner(System.in); // Scanner für die Standardeingabe
    int eingabe;
    // ==============================================================
    //int anzahlVersuche = 0;
    //for( /* ... */ ; /* ... */ ; /* ... */  ) { // Endlos-Schleife
      //anzahlVersuche++;
    // ==============================================================
    
    for( int anzahlVersuche = 1 ; /* ... */ ; anzahlVersuche++  ) { // Endlos-Schleife
      System.out.println("Eine Zahl zwischen 1 und 100 bitte eingeben:");
      eingabe = myScanner.nextInt();
      //===========================================
      // Benutzereingabe prüfen (kleiner / größer)? => Meldung schreiben nochmals versuche
      // Wenn Bentuzereingabe gleich zuErraten => Erfolgsmeldung und beenden
      if (zuErraten > eingabe) {
        System.out.println("Du liegst falsch! Die zu erratende Zahl ist größer");
      } else if (zuErraten < eingabe  ) {
        System.out.println("Du liegst falsch! Die zu erratende Zahl ist kleiner");
      } else { // zuErraten == eingabe
        System.out.println("Richtig! Du hast "  + anzahlVersuche + " Durchgänge benötigt.");
        break; // Verläßt die Schleife
      }
  
    }
  
  
    System.out.println("Die zu erratene Zahl ist: " + zuErraten);
    
    
    
  }
  
}
