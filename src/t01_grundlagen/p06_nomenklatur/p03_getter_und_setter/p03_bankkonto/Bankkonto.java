package t01_grundlagen.p06_nomenklatur.p03_getter_und_setter.p03_bankkonto;

public class Bankkonto {

  private double kontostand;

  public Bankkonto(double init) { // Konstruktor
    System.out.println("Konto mit " + init + " € eröffnet!");
    this.kontostand = init;
  }

  // Getter-Methode
  public double getKontostand() {
    return kontostand;
  }

//  public void setKontostand(double neuerKontostand) {
//    this.kontostand = neuerKontostand;
//  }

  public void einzahlen(double betrag) {
    System.out.println("Einzahlung von " + betrag + " €");
    kontostand = kontostand + betrag;
  }

  public void abbuchen(double betrag) {
    // Ist diese Abbuchung zulässig (Dispo)?
    System.out.println("Abbuchung von "+ betrag + " €");
    kontostand = kontostand - betrag;
  }

  public void printKontostand() {
    System.out.println("Kontostand: " + kontostand + " €");
  }
}
