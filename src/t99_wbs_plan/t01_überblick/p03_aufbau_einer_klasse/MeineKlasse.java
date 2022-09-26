package t99_wbs_plan.t01_überblick.p03_aufbau_einer_klasse;

/*
 * Ein Element einer Klasse ist entweder
 * static    : Statisches Element oder Klassenelement
 * non-static: Instanzelement
 */
public class MeineKlasse {
  // Variablen (static / non-static)
  int zahl = 10;
  String name = "-NA-";
  
  {} // (non-static) Instanz-Initialisierungsblock
  static {} // Statischer Initialisierungsblock
  
  // Kontruktor(en)
  public MeineKlasse() {}

  // Methoden (static / non-static)
  public void printData() { }

  // Innere Typdeklarationen (static / non-static)
  public class InnerClass { }
  public interface InnerInterface { }
}










