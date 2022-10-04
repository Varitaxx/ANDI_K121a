package t05_objektorientierung.p02_vererbung;

import java.util.List;

public class Teilnehmer extends Person {

  private String startDatum;
  private List<Massnahme> massnahmen;  // HAS Relationship

  public Teilnehmer() {
    // super(); // Implizit
  }

  public Teilnehmer(String vorname, String nachname) {
    super(vorname, nachname); // Aufruf vom Person-Konstruktor
  }

  public Teilnehmer(String vorname, String nachname, String startDatum) {
    super(vorname, nachname);
    this.startDatum = startDatum;
  }

  public String getStartDatum() {
    return startDatum;
  }

  public void setStartDatum(String startDatum) {
    this.startDatum = startDatum;
  }

  @Override
  public void printInfo() {
    super.printInfo(); // printInfo() der Person-Klasse
    System.out.println("Startdatum: " + startDatum);
  }
}
