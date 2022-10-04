package t05_objektorientierung.aufgaben.aufgabe5C.Lösung;

public abstract class Mitarbeiter extends Person implements Motivationsfähig {

  private String steuernummer; // z.B. 210/1454/5466

  public Mitarbeiter() {
  }

  public Mitarbeiter(String vorname, String nachname) {
    super(vorname, nachname);
  }

  public String getSteuernummer() {
    return steuernummer;
  }

  public void setSteuernummer(String steuernummer) {
    this.steuernummer = steuernummer;
  }

  @Override
  public void printInfo() {
    super.printInfo(); // Person.printInfo()
    System.out.println("Steuernummer: " + steuernummer);
  }
}
