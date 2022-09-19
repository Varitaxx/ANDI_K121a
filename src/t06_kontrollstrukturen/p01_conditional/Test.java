package t06_kontrollstrukturen.p01_conditional;

import java.time.LocalDate;

public class Test {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    int zahl = 22;
    if (zahl % 2 == 0) {
      System.out.println("Gerade Zahl");
    } else {
      System.out.println("Ungerade Zahl");
    }
  
  
    schlaltjahrTest();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void schlaltjahrTest() {
    if (istSchaltjahr()) {
      System.out.println("Dieses Jahr ist ein Schaltjahr");
    } else {
      System.out.println("Dieses Jahr ist kein Schaltjahr");
    }
    
    System.out.println("Dieses Jahr ist " +
                           (istSchaltjahr() ? "ein" : "kein")
                           + " Schaltjahr");
  }
  
  public static boolean istSchaltjahr() {
    //LocalDate heute = LocalDate.now();
    //return heute.isLeapYear();
    return LocalDate.now()
                    .isLeapYear();
  }
  
}
