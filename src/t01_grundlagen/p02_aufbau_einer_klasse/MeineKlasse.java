package t01_grundlagen.p02_aufbau_einer_klasse;

public class MeineKlasse {
  // Variablen (static/non-static)
  int zahl;
  static String name;
  
  // Initialisierungsblöcke (static/non-static)
  {} // (non-static) Instanz-Initialisierungsblock
  static {} // Statischer Initialisierungsblock
  
  // Kontruktor(en)
  public MeineKlasse() {}

  // Methoden (static/non-static)
  public void printData() { }

  // Innere Typdeklarationen (static/non-static)
  public class InnerClass { }
  public interface InnerInterface { }
}


