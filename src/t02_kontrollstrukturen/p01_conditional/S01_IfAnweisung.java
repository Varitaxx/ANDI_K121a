package t02_kontrollstrukturen.p01_conditional;

import java.time.LocalDate;

public class S01_IfAnweisung {
  
  public static void main(String[] args) {
    
    System.out.println("============================================================");
    ifTest();
//    ifElseTest();
//    ifElseIfElseTest();
    System.out.println("======================= end of main() ======================");
  }

  public static void ifTest() {
    int alter = 16;
    if ( alter >= 18 ) {
      System.out.println("Erwachsen");
    }
  }

  public static void ifElseTest() {
    int zahl = 21;
    if (zahl % 2 == 0) {
      System.out.println("Gerade Zahl");
    } else {
      System.out.println("Ungerade Zahl");
    }
    // Alternative mit dem Ternären Operator
    // System.out.println( zahl % 2 == 0 ? "Gerade Zahl" : "Ungerade Zahl" );
  }


  public static void ifElseIfElseTest() {
    // int uhrzeit = LocalTime.now().getHour();
    int uhrzeit = 20;

    if (uhrzeit < 11) {
      System.out.println("Guten Morgen!");
    } else if (uhrzeit < 18) {
      System.out.println("Guten Tag!");
    } else {
      System.out.println("Guten Abend!");
    }
  }
  
  private static void schlaltjahrTest() {
    if (istSchaltjahr()) {
      System.out.println("Dieses Jahr ist ein Schaltjahr");
    } else {
      System.out.println("Dieses Jahr ist kein Schaltjahr");
    }
    
    System.out.println("Dieses Jahr ist " + (istSchaltjahr() ? "ein" : "kein")
                           + " Schaltjahr");
  }
  
  public static boolean istSchaltjahr() {
    //LocalDate heute = LocalDate.now();
    //return heute.isLeapYear();
    return LocalDate.now()
                    .isLeapYear();
  }
  
  
}
