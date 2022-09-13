package t02_grundlagen.p05_static_non_static;

public class Auto {

  // Instanzvariablen (non-static)
  String hersteller;  // VW z.B.
  String modell;      // Golf ...

  // Klassenvariable (static)
  static int counter;  // Anzahl der Autos im Autosalon

  // ==============================================================
  // =        Ein statisches Element (Variable, Methode, Innere..)
  // =        kann NUR auf andere statische Elemente zugreifen                =
  // ==============================================================

  // Instanzmethode (non-static)
  public /* non-static */ void printData() {
    System.out.println("***********************************");
    System.out.println("Hersteller: " + hersteller);
    System.out.println("Modell: " + modell);
    System.out.println("***********************************");
  }

  // Klassenmethode (static)
  public static void printCounter() {
    System.out.println("Counter: " + counter);
  }

  class Inner1{}
  static class Inner2{}
}
