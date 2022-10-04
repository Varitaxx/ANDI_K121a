package t05_objektorientierung.aufgaben.aufgabe5C.Lösung;

public class Freiberufler extends Mitarbeiter {

  private double stundensatz;

  public Freiberufler() {
  }

  public Freiberufler(String vorname, String nachname) {
    super(vorname, nachname);
  }

  public double getStundensatz() {
    return stundensatz;
  }

  public void setStundensatz(double stundensatz) {
    this.stundensatz = stundensatz;
  }

  @Override
  public void printInfo() {
    super.printInfo();  // Mitarbeiter.printInfo() => vorname, nachname, steuernummer
    System.out.println("Stundensatz: " + stundensatz + " €");
  }

  @Override
  public void motiviere() {
    System.out.println("Motiviere Freiberufler ...");
    stundensatz *= 1.05;  // 5% Erhöhung vom Stundensatz
  }

}
