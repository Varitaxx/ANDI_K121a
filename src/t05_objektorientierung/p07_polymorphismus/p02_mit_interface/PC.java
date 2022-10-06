package t05_objektorientierung.p07_polymorphismus.p02_mit_interface;

public class PC implements Startable {
  private double speed = 2.0; // GHz

  @Override
  public void start() {
    System.out.println("PC wird gestartet ...");
  }

  public double getSpeed() {
    return speed;
  }


}
