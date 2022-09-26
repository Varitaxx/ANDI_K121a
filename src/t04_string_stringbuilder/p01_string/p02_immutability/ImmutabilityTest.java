package t04_string_stringbuilder.p01_string.p02_immutability;

public class ImmutabilityTest {

  public static void main(String[] args) {
    // Immutability = Unveränderlichkeit
    personTest();
    stringTest();
  }

  private static void personTest() {
    // Die Klasse Person ist immutable
    // Wenn ein Person-Objekt erstellt wird, kann es nicht mehr verändert werden
    Person person1 = new Person("Peter", "Schmidt");
    printWithAddress("person1", person1);
    System.out.println("=============================================================");
    Person person2 = person1.setzeVorname("Hans"); // Hans Schmidt
    printWithAddress("person1", person1);
    printWithAddress("person2", person2);
  }

  private static void stringTest() {
    // Die Klasse String ist immutable
    // => Wenn ein String-Objekt erstellt wird, kann es nicht mehr verändert werden !!!
    String s1 = "Hallo";
    System.out.println("=============================================================");
    printWithAddress("s1", s1);  // Hallo (2752F6E2)
    System.out.println("=============================================================");
    System.out.println("Nach s1.replaceAll('l', 'X')");
    s1.replaceAll("l", "X"); // ein neues Objekt: "HaXXo"
    printWithAddress("s1", s1);  // Hallo (2752F6E2)
    System.out.println("=============================================================");
    System.out.println("Nach s1 = s1.replaceAll('l', 'X')");
    s1 = s1.replaceAll("l", "X"); // ein neues Objekt: "HaXXo"
    printWithAddress("s1", s1); // HaXXo (52AF6CFF)
    System.out.println("=============================================================");
  }

  public static void printWithAddress(String text, Object obj) {
    // System.identityHashCode(obj): Speicheradresse von obj
    System.out.format("%s: (%8H) %s %n", text, System.identityHashCode(obj), obj);
    //    Beipsiel:          "person1: Peter Schmidt (A2B2345)
  }

}
