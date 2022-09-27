package t03_deklarationen.p08_enums.p01_example1;

public class SizeTest {
  public static void main(String[] args) {
  
    System.out.println("============================================================");
    /*
      Person p1 = new Person();
      p1.vorname = "Peter"; // Instanzvariable (non-static)
      
      Person.counter = 10; // Klassenvariable (static)
     */
  
    //Size mySize = new Size(); // Alle Konstruktoren sind implizit "private"
    Size mySize = Size.L;
    System.out.println("mySize.name(): " + mySize.name());
    System.out.println("mySize.ordinal(): " + mySize.ordinal());
    System.out.println("============================================================");
    // String (z.B. aus Formular) -> Size
    String eingabe = "S"; // Benutzereingabe
    mySize = Size.valueOf( eingabe.toUpperCase() );
    System.out.println("mySize: " + mySize);
    System.out.println("mySize.ordinal(): " + mySize.ordinal());
    System.out.println("============================================================");
    // Alle Konstanten der enum iterieren: Size.values()
    Size[] values = Size.values(); // Array von Size-Konstanten
    for( Size size : values ) {
      System.out.println(size);
    }
    System.out.println("============================================================");
    // Prüfung auf Gleichheit mit "if"
    if (mySize == Size.S)
      System.out.println("Small");
    System.out.println("============================================================");
    // Prüfung auf Gleichheit mit "switch"
    switch (mySize) {
      case S: // Size.S => COMPILER-FEHLER
        System.out.println("Small");
        break;
      case M:
        System.out.println("Medium");
        break;
      // ..
      // ..
      // ..
      // ..
    }
  
  
    System.out.println("======================= end of main() ======================");
  }
}
