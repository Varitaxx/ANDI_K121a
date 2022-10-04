package t05_objektorientierung.p02_vererbung;

import java.util.List;

public class Dozent extends Person {            // Dozent-Person       : IS Relationship

  private int personalNummer;

  // Wenn Dozent nur eine Veranstaltung hätte: =>
  //  private Veranstaltung veranstaltung;      // Dozent-Veranstaltung: HAS Relationship
  private List<Veranstaltung> veranstaltungen;  // Dozent-Veranstaltung: HAS Relationship

  public Dozent() { }

  public Dozent(String vorname, String nachname) {
    super(vorname, nachname); // Aufruf des Person-Konstruktors
  }

  public int getPersonalNummer() {
    return personalNummer;
  }

  public void setPersonalNummer(int personalNummer) {
    this.personalNummer = personalNummer;
  }

  @Override
  public void printInfo() {
    super.printInfo();  // printInfo() der Person-Klasse
    System.out.println("Personalnummer: " + personalNummer);
  }
}
