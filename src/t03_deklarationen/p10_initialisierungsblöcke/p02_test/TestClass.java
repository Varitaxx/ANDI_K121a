package t03_deklarationen.p10_initialisierungsblöcke.p02_test;

// Inhalt einer Klasse: Variablen-, Methoden-, Kontruktor- und Innere Typdeklarationen + Initialisierungsblöcke
class TestClass {
  static int counter = 3;

  // Statischer Initialisierungsblock:
  // wird einmalig beim Laden der Klasse in die JVM ausgeführt
  static {
    System.out.println("===> Statischer Initialisierungsblock");
  }
  
  // Instanz-Initialisierungsblock:
  // wird bei jedem Konstruktoraufruf ausgeführt
  {
    System.out.println("===> Instanz-Initialisierungsblock");
  }

  public TestClass() {
    System.out.println("===> TestClass()-Konstruktor");
  }
}