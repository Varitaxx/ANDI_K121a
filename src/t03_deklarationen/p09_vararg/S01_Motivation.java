package t03_deklarationen.p09_vararg;

public class S01_Motivation {
  public static void main(String[] args) {
    // Für unterschiedliche Anzahl von Parameter wird eine NEUE Methode benötigt
    System.out.println(summe(4, 6));
    System.out.println(summe(4, 6, 10));
    System.out.println(summe(4, 6, 10, 20));

    // Mehr Aufwand: Ein Array muss immer vorbereitet werden !!!
    double[] zahlen = {2, 4, 5, 8, 12, 4, 45, 1, 456};
    System.out.println(summe(zahlen));

    // Lösung ===> Vararg: double summe(double... zahlen) {..}
  }

  private static double summe(double a, double b) {
    return a + b;
  }

  private static double summe(double a, double b, double c) {
    return a + b + c;
  }

  private static double summe(double a, double b, double c, double d) {
    return a + b + c + d;
  }

  private static double summe(double[] zahlen) {
    double summe = 0;
    for( double zahl : zahlen ) {
      summe += zahl;
    }
    return summe;
  }
}
