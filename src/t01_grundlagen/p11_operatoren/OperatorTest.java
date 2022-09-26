package t01_grundlagen.p11_operatoren;

public class OperatorTest {
  public static void main(String[] args) {
    int a = 12;
    System.out.println(a = 8);

    booleanTest();
  }

  private static void booleanTest() {
    int a = 12;
    boolean condition = a < 0;  // false
//    if (condition = true) {   // Logischer FEHLER, da dieser Ausdruck eine Zuweisung ist !!!!!
//    if (condition == true) {  // Da ist der Vergeleichsoperator ==
    if (condition) {            // Die bessere Alternative
      System.out.println("Es ist eine negative Zahl");
    }

    if ( ! condition) { /* ... */ }

    if (not(condition)) { /* ... */}
  }

  public static boolean not(boolean input) {
    return ! input;
  }

}

