package t03_deklarationen.p08_enums.p01_example1;

public class SizeTest {
  public static void main(String[] args) {

  /*
    Person p1 = new Person();
    p1.vorname = "Peter";

    Person.counter = 10;  // Klassenvariable (static)


   */

//    Size mySize = new Size(); // FEHLER
    Size mySize = Size.L;
    System.out.println("mySize.name()   : " + mySize.name() );
    System.out.println("mySize.ordinal(): " + mySize.ordinal() );
    System.out.println("=======================================");
    // String -> Size
    mySize = Size.valueOf("S");
    System.out.println("mySize: " + mySize);

    System.out.println("=======================================");
    // Alle Konstanten iterieren: Size.values()
    Size[] values = Size.values();
    for( Size size : values ) {
      System.out.println(size);
    }
    System.out.println("=======================================");
    // Vergleich auf Gleichheit mit "if"
    if (mySize == Size.S)
      System.out.println("Small");
    // ========================================================
    // Vergleich auf Gleichheit mit "switch"
    switch (mySize) {
      case S: // Size.S ===> COMPILER-FEHLER
        System.out.println("Small");
        break;
      case M: // Size.S ===> COMPILER-FEHLER
        System.out.println("Medium");
        break;
      // ...
      // ...
      // ...
    }
  }
}
