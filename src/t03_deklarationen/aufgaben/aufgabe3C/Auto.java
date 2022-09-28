
package t03_deklarationen.aufgaben.aufgabe3C;

enum Farbe {ROT, GRÜN, BLAU, SCHWARZ, WEISS}
enum Getriebe { AUTOMATIK, GANGSCHALTUNG }
enum Antrieb {  ALLRAD, VORDER, HECK }
enum Kraftstoff { BENZIN, DIESEL, ELEKTRO, HYBRID }



public class Auto {
  private String hersteller;
  private String modell;
  // =============================================================================
  //private String farbe;    // Rot, Grün, Blau, Schwarz, Weiß
  private Farbe farbe;       // Rot, Grün, Blau, Schwarz, Weiß
  // =============================================================================
  //private String getriebe; // Automatik, Gangschaltung
  private Getriebe getriebe; // Automatik, Gangschaltung
  // =============================================================================
  //private String antrieb;  // Allrad, Vorder, Heck
  private Antrieb antrieb;   // Allrad, Vorder, Heck
  // =============================================================================
  //private String kraftstoff;   // Benzin, Diesel, Elektro, Hybrid
  private Kraftstoff kraftstoff; // Benzin, Diesel, Elektro, Hybrid
  // =============================================================================
  private int    anzahlZylinder; // 2,4,6,16
  private int    hubraum; // in cm³ (2000 cm³ = 2 Liter)
  // =============================================================================
  // Konstruktoren
  // =============================================================================
  
  public Auto( String hersteller, String modell,
               Farbe farbe, Getriebe getriebe, Antrieb antrieb,
               Kraftstoff kraftstoff, int anzahlZylinder, int hubraum ) {
    this.hersteller = hersteller;
    this.modell = modell;
    this.farbe = farbe;
    this.getriebe = getriebe;
    this.antrieb = antrieb;
    this.kraftstoff = kraftstoff;
    this.anzahlZylinder = anzahlZylinder;
    this.hubraum = hubraum;
  }
  // =============================================================================
  public void printInfo() {
    System.out.println("============================================================");
    System.out.println("=                     KFZ-Beschreibung                     =");
    System.out.println("============================================================");
    System.out.println("Hersteller / Modell: " + hersteller + " " + modell);
    System.out.println("Farbe         : " + farbe);
    System.out.println("Getriebe      : " + getriebe);
    System.out.println("Antrieb       : " + antrieb);
    System.out.println("Kraftstoff    : " + kraftstoff);
    System.out.println("Zylinderanzahl: " + anzahlZylinder);
    System.out.println("Hubraum       : " + hubraum + " cm³");
  }
  
}
