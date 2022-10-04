package t05_objektorientierung.p03_interfaces.p00_intro;

public class PC implements Startable {
  
  @Override
  public void start() {
    System.out.println("PC wird gestartet ...");
  }
  
}
