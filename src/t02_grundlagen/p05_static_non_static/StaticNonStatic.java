package t02_grundlagen.p05_static_non_static;

public class StaticNonStatic {

  public static void main(String[] args) {
    // new Auto() => erstellt eine Instanz der Klasse Auto

    Auto auto1 = new Auto();
    auto1.hersteller = "BMW";
    auto1.modell = "520i";


    Auto auto2 = new Auto();
    auto2.hersteller = "VW";
    auto2.modell = "Passat Variant";

    auto1.printData();
    auto2.printData();

    // Auto.hersteller = "Renault"; // FEHLER, da hersteller eine Instanzvariable ist.

    // ################# static (Klassenelemente)
    auto1.counter = 2; // kein guter Stil, da counter eine Klassenvariable ist
    auto2.counter = 5;


    System.out.println("auto1.counter: " + auto1.counter); // 5

    Auto.counter = 10; // guter Stil
    System.out.println("auto1.counter: " + auto1.counter); // 10
    System.out.println("auto2.counter: " + auto2.counter); // 10

    Auto.printCounter(); // 10
  }
}
