package t03_deklarationen.p07_interfaces;

public class Waschmaschine implements Startable {
    int drehZahl;  // 800,1200,1400


  @Override // Hinweis an den Compiler, dass die aktuelle Methode eine Methode der Supertypen überschreibt
  public void start() {
    System.out.println("Waschmaschine wird gestartet ...");
  }

  public void schleudern() {
    System.out.println("Schleudervorgang wird gestartet ...");
  }

}
