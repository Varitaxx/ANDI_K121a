package t02_kontrollstrukturen.p02_loops;

import java.util.Enumeration;
import java.util.Vector;

public class S02_While {
  public static void main(String[] args) {
    basisTest();
//    arrayTest();
//    enumerationTest();
//    endlosSchleife();
    System.out.println("=== END ===");
  }

  private static void basisTest() {
//    for( int i = 0 ; i < 5 ; i++ ) {
//      System.out.println(i);
//    }
    // Alternative zur for-Schleife mit while
    int i = 0;
    while (i < 5)
      System.out.println(++i);

    System.out.println("-");
  }

  private static void arrayTest() {
    int[] zahlen = {77, 4, 55};
    int i = 0;
    while (i < zahlen.length) {
      System.out.println(zahlen[i]);
      i++;
    }
  }

  private static void enumerationTest() {
    Vector<String> programmiersprachen = new Vector<>(); // Vector nicht mehr benutzen
    programmiersprachen.add("Java");
    programmiersprachen.add("Scala");
    programmiersprachen.add("C++");
    Enumeration<String> en = programmiersprachen.elements();
    // Enumeration.hasMoreElements(), Enumeration.nextElement();
    while (en.hasMoreElements()) {
      String sprache = en.nextElement();
      System.out.println(sprache);
    }
  }

  private static void endlosSchleife() {
    while (true) {
      System.out.println(".");
    }
  }

}
  /*

  while(true) {                     do {
    - step1                           - step1
    - step2                           - step2
    - step3                           - step3
                     =====>

    if (condition)                  } while (!condition)
      break;
  }

===============
  while(true) {                       while(!condition) {
    if (condition)                      - step1
      break;                            - step2
    - step1          =====>             - step3
    - step2                           }
    - step3
  }


   */



