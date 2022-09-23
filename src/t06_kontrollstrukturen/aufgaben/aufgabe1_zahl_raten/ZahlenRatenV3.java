package t06_kontrollstrukturen.aufgaben.aufgabe1_zahl_raten;


import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenV3 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    // Eine Zahl zwischen 20 und 30 raten
    rateZahl(20, 30);
    System.out.println("======================= end of main() ======================");
  }
  
  // Zahl zwischen "start" und "end" generieren
  public static int zahlGenerieren( int start, int end) { // Beide inklusive
    Random rd = new Random();
    int generated = start + rd.nextInt(end - start + 1);
    return generated;
  }
  
  public static void rateZahl(int start, int end ) {
    //===========================================
    // Einmalig eine Zufallszahl generieren
    //===========================================
    int zuErraten = zahlGenerieren( start, end);
    Scanner myScanner = new Scanner(System.in); // Scanner für die Standardeingabe
    int eingabe = -1; // Lokale Variablen müssen vor dem ersten Lesevorgang initialisiert werden
    int anzahlVersuche = 0;
    for( /* no init */ ; eingabe != zuErraten ; anzahlVersuche++ ) { // Endlos-Schleife
      System.out.println("Eine Zahl zwischen " + start + " und " + end + " bitte eingeben:");
      eingabe = myScanner.nextInt();
      if (zuErraten > eingabe) {
        System.out.println("Du liegst falsch! Die zu erratende Zahl ist größer");
      } else if (zuErraten < eingabe) {
        System.out.println("Du liegst falsch! Die zu erratende Zahl ist kleiner");
      }
    }
    System.out.println("Richtig! Du hast " + anzahlVersuche + " Durchgänge benötigt.");
    System.out.println("Die zu erratene Zahl ist: " + zuErraten);
  }
  
  
}
  
