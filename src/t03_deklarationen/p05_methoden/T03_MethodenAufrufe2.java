package t03_deklarationen.p05_methoden;

import java.util.Random;

public class T03_MethodenAufrufe2 {


  public static void main(String[] args) {
    System.out.println("##### START #####");
    methode1();
// ==================================================
//    methode2("Peter"); // "Peter" ist das Argument des Methodenaufrufs

//    String name = "Hans"; // oder durch Benutereingabe
//    methode2(name);
// ==================================================
//    methode3(); // OK, aber Rückgabewert der Methode ist verloren

//    int res = methode3();
//    System.out.println("Result: " + res);
//                       String   +    int

//    System.out.println("Result: " + methode3()); // Alternative

//    int res = methode3() * 2 + 180; // int * 2 + 180
// ==================================================
//    methode4(100, 50);// OK, aber Rückgabewert der Methode ist verloren

//    System.out.println("methode4(100,50): " + methode4(100, 50));
// ==================================================

    System.out.println("##### END  #####");
  }


  public static void methode1() {                  // Aufruf: methode1();
    System.out.println("===> void methode1() in Action ...");
  }


  public static void methode2(String name) {      // Aufruf: methode2(stringAusdruck);
    System.out.println("===> void methode2(String) in Action ...");
    System.out.println("Hallo " + name + "!");
  }

  // Generator von 0 bis 99
  public static int methode3() {                  // Aufruf: int res = methode3();
    System.out.println("===> int methode3() in Action ...");
    Random rd = new Random();
    int generierteZahl = rd.nextInt(100);
    return generierteZahl;
  }

  public static int methode4(int a, int b) {      // Aufruf: int res = methode4(intAusdruck1, intAusdruck2);
    System.out.println("===> int methode4(int, int) in Action ...");
//   int summe = a + b;
//   return summe;
    return a + b; // Alternative

  }



}
