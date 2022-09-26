package t03_deklarationen.p07_interfaces;

public class PC implements Startable {
  double prozessorTakt;

  @Override
  public void start() {
    System.out.println("PC wird gestartet ...");
  }

  public void hibernate() {
    System.out.println("PC geht in den Hibernate-Modus über ...");
  }
}
