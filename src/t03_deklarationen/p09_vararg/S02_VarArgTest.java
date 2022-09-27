package t03_deklarationen.p09_vararg;

public class S02_VarArgTest {

  // VarArg steht für Variable Arguments
  public static void main(String[] args) {

    System.out.println(summe());   // Bei VarArg: Aufruf ohne Argumente möglich
    System.out.println(summe(4, 6));
    System.out.println(summe(4, 6, 10));
    System.out.println(summe(4, 6, 10, 20));
    System.out.println(summe(4, 6, 10, 20, 40, 888, 1, 7));
  }

  // Eine einzige Methode erfüllt den Zweck
  private static double summe(double... zahlen) { //
    double result = 0;
    for( double zahl : zahlen ) {
      result += zahl;
    }
    return result;
  }

  private static double produkt(double... zahlen) { //
    double result = 1;
    for( double zahl : zahlen ) {
      result = result * zahl;
    }
    return result;
  }

  // DER VarArg-Parameter muss der letze in der Parmameterliste sein
  private static double someMethod(int a, int b, Person... personen) {
    return 12.0;
  }

}

class Person {}