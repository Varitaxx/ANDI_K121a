package t03_deklarationen.p09_vararg;

public class S01_Motivation {
  public static void main(String[] args) {

    System.out.println("summe(3 , 4)         : " + summe(3 , 4));
    System.out.println("summe(3,4,9)         : " + summe(3, 4, 9));
    System.out.println("summe(3,4,9,2)       : " + summe(3, 4, 9, 2));
    double[] zahlenArray = { 3, 4, 9, 2, 7, 12 };
    System.out.println("summe( zahlenArray ) : " + summe( zahlenArray ));
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
