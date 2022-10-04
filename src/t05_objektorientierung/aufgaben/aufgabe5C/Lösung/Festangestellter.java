package t05_objektorientierung.aufgaben.aufgabe5C.Lösung;

public class Festangestellter extends Mitarbeiter {

  private double gehalt;

  public Festangestellter() {
  }

  public Festangestellter(String vorname, String nachname) {
    super(vorname, nachname);
  }

  public double getGehalt() {
    return gehalt;
  }

  public void setGehalt(double gehalt) {
    this.gehalt = gehalt;
  }

  @Override
  public void printInfo() {
    super.printInfo(); // Mitarbeiter.printInfo() => vorname, nachname, steuernummer
    System.out.println("Gehalt: " + gehalt + " €");
  }

  @Override
  public void motiviere() {
    gehalt *= 1.05; // 5% Gehaltserhöhung
  }
}
