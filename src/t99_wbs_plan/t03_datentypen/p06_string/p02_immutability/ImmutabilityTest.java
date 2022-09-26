package t99_wbs_plan.t03_datentypen.p06_string.p02_immutability;

public class ImmutabilityTest {

  public static void main(String[] args) {
    // Immutability = Unveränderlichkeit
    stringTest();
  }

  private static void stringTest() {
    // Die Klasse String ist immutable
    // => Wenn ein String-Objekt erstellt wird, kann es nicht mehr verändert werden !!!
    String str = "Hallo";
    System.out.println("str: " + str);

    System.out.println("=============================================================");
    System.out.println("str.replaceAll('l', 'X')");
    str.replaceAll("l", "X");          // ein neues Objekt: "HaXXo"
    System.out.println("str: " + str); // Hallo

    System.out.println("=============================================================");
    System.out.println("str = str.replaceAll('l', 'X')");
    str = str.replaceAll("l", "X");
    System.out.println("str: " + str); // "HaXXo"
    
    System.out.println("=============================================================");
  }


}
