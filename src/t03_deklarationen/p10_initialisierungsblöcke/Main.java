package t03_deklarationen.p10_initialisierungsblöcke;

public class Main {


  public static void main(String[] args) throws ClassNotFoundException {
    System.out.println("=============================================================");
    System.out.println("Die Klasse Test wird in die virtuelle Maschine geladen ...");
    System.out.println("Test.counter: " + Test.counter); // Erzwingt das Laden der Klasse Test in die virtuelle Maschine
    System.out.println("=============================================================");
    new Test(); // Alle Instanzvariablen, Initialsierungsblöcke und der Konstruktor werden angestoßen
    System.out.println("===============================");
    new Test(); // Alle Instanzvariablen, Initialsierungsblöcke und der Konstruktor werden angestoßen
  }
}
// #####################################################################################################################
// #####################################################################################################################
// #####################################################################################################################
// Inhalt einer Klasse: Variablen-, Methoden-, Kontruktor- und Innere Typdeklarationen + Initialisierungsblöcke
class Test {
  static int counter = 3;
  //  System.out.println("===>  irgendwas"); // FEHLER
  // ===================================================================================================
  // Statischer Initialisierungsblock: Wird beim Laden der Klasse in die virtuelle Maschine ausgeführt
  // ===================================================================================================
  static {
    System.out.println("===> Statischer Initialisierungsblock 1");
  }

  static {
    System.out.println("===> Statischer Initialisierungsblock 2");
  }
  // ===================================================================================================
  int zahl; // Instanzvariable
  // ===================================================================================================
  // Nicht-Statischer Initialisierungsblock: Wird beim Instanziieren der Klasse ausgeführt
  // ===================================================================================================
  {
    System.out.println("===> Instanz-Initialisierungsblock 1");
    int a = 23;
    int zahl = 45; // Block-Lokale Variable
    System.out.println("this.zahl: " + this.zahl);
    System.out.println("Lokale zahl: " + zahl);
    this.zahl = 99;
  }

  {
    System.out.println("===> Instanz-Initialisierungsblock 2");
  }


  public Test() {
    System.out.println("===> Test()-Konstruktor");
    System.out.println("this.zahl: " + this.zahl);
  }

}
// #####################################################################################################################
// #####################################################################################################################
// #####################################################################################################################
