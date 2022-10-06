package t05_objektorientierung.p07_polymorphismus.p01_mit_klassen;

public class Mitarbeiter extends Person {

  private double gehalt;

  public Mitarbeiter() {
  }

  public Mitarbeiter(String vorname, String nachname) {
    super(vorname, nachname); // Aufruf des Person(String, String)-Konstruktors
  }

  public Mitarbeiter(String vorname, String nachname, double gehalt) {
    super(vorname, nachname); // Aufruf des Person(String, String)-Konstruktors
    this.gehalt = gehalt;
  }

  public double getGehalt() {
    return gehalt;
  }

  public void setGehalt(double gehalt) {
    this.gehalt = gehalt;
  }

  @Override
  public void printData() {
    super.printData(); // Person.printData()
    System.out.format("Gehalt: %.2f%n", gehalt);
  }


}
