package t03_deklarationen.p07_interfaces;

// Eine konkrete (nicht abstrakt) Klasse  muss
// alle abstrakten Methoden von allen Supertypen überschreiben
public class PC implements Startable {
  double prozessorTakt;

  @Override // Überschreiben
  public void start() {
    System.out.println("PC wird gestartet ...");
  }

  public void hibernate() {
    System.out.println("PC geht in den Hibernate-Modus über ...");
  }
}
