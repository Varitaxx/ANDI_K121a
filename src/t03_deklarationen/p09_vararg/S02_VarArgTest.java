package t03_deklarationen.p09_vararg;

public class S02_VarArgTest {

  // VarArg steht für Variable Arguments
  public static void main(String[] args) {
    // Bei VarArg: Aufruf ohne Argumente möglich (0..n kommagetrennte Argumente)
    System.out.println("summe()            : " + summe());
    System.out.println("summe(4, 6)        : " + summe(4, 6));
    System.out.println("summe(4, 6, 10)    : " + summe(4, 6, 10));
    System.out.println("summe(4,6,10,20,40): " + summe(4,6,10,20,40));
    // =============================================================================
    anotherMethod("string", 1.2);  // 0 Argumente für den letzten Parameter
    anotherMethod("string", 1.2, 3, 4.5, 6, 67, 12);
    // =============================================================================
    
  }
  
  // Eine einzige Methode erfüllt den Zweck
  private static double summe( double... zahlen ) {  // zahlen ist ein double[]
    double summe = 0;
    for( double zahl : zahlen ) {
      summe = summe + zahl; // summe += zahl
    }
    return summe;
  }
  
  // Der Parameter mit VarArg muss der letzte sein!!!
  private static void anotherMethod(String title, double a, double... zahlen) {
  }


}

class Person {}