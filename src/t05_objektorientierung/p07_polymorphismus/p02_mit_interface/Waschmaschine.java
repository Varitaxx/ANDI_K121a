package t05_objektorientierung.p07_polymorphismus.p02_mit_interface;

public class Waschmaschine implements Startable {

  @Override
  public void start() {
    System.out.println("Waschmaschine wird gestartet ...");
  }
}
