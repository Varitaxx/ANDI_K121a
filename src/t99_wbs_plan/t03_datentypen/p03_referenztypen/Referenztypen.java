package t99_wbs_plan.t03_datentypen.p03_referenztypen;

public class Referenztypen {

  public static void main( String[] args ) {
    // Referenztypen: Klassen (class), Schnittstellen (interface),
    // Aufzählungstypen (enum), Annotationen (@interface), ArrayTest
    System.out.println("============================================================");
    String str1 = "Hallo";
    String str2 = new String("Hallo");
    // =============================================================================
    Person p1 = new Person();
    // =============================================================================
    Startable st1 = null; // = ...
    // =============================================================================
    Size tShirtGröße = Size.XL;
    // =============================================================================
    int zahl = 12;
    int[] zahlenArray = { 2, 4, 9 }; // Ein Array ist ein Referenztyp
    System.out.println("zahlenArray[0]: " + zahlenArray[0]);
    System.out.println("======================= end of main() ======================");
  }
  
  public static Startable methode(String str, Person p, Size s) {
    return null;
  }
  
}


class Person { }

interface Startable { }

enum Size { S, M, L, XL, XXL, XXXL}