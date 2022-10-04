package t05_objektorientierung.p03_interfaces.p00_intro;

// Waschmaschine ist eine implementierende Klasse der Startable-Interface
// Waschmaschine ist ein Untertyp von Startable
// Startable ist ein Supertyp von Waschmaschine
public class Waschmaschine implements Startable {
  
  // Waschmaschine muss alle abstrakten Methoden von allen Supertypen überschreiben
  @Override
  public void start() { //
    System.out.println("Waschmaschine wird gestartet ...");
  }

}
