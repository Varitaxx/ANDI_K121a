package t06_kontrollstrukturen.aufgaben.aufgabe1_zufallszahl;


import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenV2 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    rateZahl();
    System.out.println("======================= end of main() ======================");
  }
  
  public static void rateZahl() {
    //===========================================
    // Einmalig eine Zufallszahl generieren
    //===========================================
    Random rd = new Random();
    int zuErraten = rd.nextInt(100) + 1; // 1..100
    Scanner myScanner = new Scanner(System.in); // Scanner für die Standardeingabe
    int eingabe = -1; // Lokale Variablen müssen vor dem ersten Lesevorgang initialisiert werden
    int anzahlVersuche = 0;
    for( /* no init */ ; eingabe != zuErraten ; anzahlVersuche++ ) { // Endlos-Schleife
      System.out.println("Eine Zahl zwischen 1 und 100 bitte eingeben:");
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
  
