package t99_wbs_plan.t04_t05_operatoren;

public class S05_BoolischeOperatoren {
  
  // ===============================================================================
  public static void main(String[] args) {
//    basics();
//    shortcutOperators1();
//    shortcutOperators2();
    shortcutOperators3();
    System.out.println("=== END ===");
  }

  // ===============================================================================

  private static void basics() {
    int a = 10, b = 5;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("===================================================");
    System.out.println("a < 20 && b > 0 : " + (a < 20 && b > 0)); // true
    System.out.println("a > 20 && b > 0 : " + (a > 20 && b > 0)); // false
    System.out.println("##### Wertetabelle für den UND-Operator #####");
    System.out.println("true  && true : " + (true && true));   // true
    System.out.println("true  && false: " + (true && false));  // false
    System.out.println("false && true : " + (false && true));  // false
    System.out.println("false && false: " + (false && false)); // false
    System.out.println("===================================================");
    System.out.println("a > 20 || b > 0 : " + (a > 20 || b > 0));  // true
    System.out.println("a > 20 || b > 10: " + (a > 20 || b > 10)); // false
    System.out.println("##### Wertetabelle für den ODER-Operator #####");
    System.out.println("true  || true : " + (true || true));   // true
    System.out.println("true  || false: " + (true || false));  // true
    System.out.println("false || true : " + (false || true));  // true
    System.out.println("false || false: " + (false || false)); // false
    System.out.println("===================================================");
    System.out.println("a > 20 ^ b > 0  : " + (a > 20 ^ b > 0));   // false ^ true  = true
    System.out.println("a < 20 ^ b > 20 : " + (a < 20 ^ b > 20));  // true  ^ false = true
    System.out.println("##### Wertetabelle für den XOR-Operator #####");
    System.out.println("true  ^ true : " + (true ^ true));   // false
    System.out.println("true  ^ false: " + (true ^ false));  // true
    System.out.println("false ^ true : " + (false ^ true));  // true
    System.out.println("false ^ false: " + (false ^ false)); // false
    System.out.println("===================================================");
  }
  // ##############################################################################################
  private static void shortcutOperators1() {
    int a = 5, b = 10;
    //wenn der erste Operand false ist, der &&-Operator prüft nicht weiter
    if ( a % 2 == 0 && b % 2 == 0 ) {
      System.out.println("Beide Zahlen sind gerade!");
    }
  }
  
  // ===============================================================================
  private static void shortcutOperators2() {
    int a = 5, b = 10;
    // bei &&: Wenn der 1. Operand false ist, wird der Zweite nicht ausgewertet
    if ( istGerade(a) && istGerade(b) ) { // &&: "Shortcut AND Operator"
    // if (istGerade(a) & istGerade(b)) { // &: "AND Operator": Beide Operanden werden ausgewertet
  
      System.out.println("Beide Zahlen sind gerade!");
    }
  }
  // =====================================
  private static boolean istGerade(int zahl) {
    System.out.println("istGerade(" + zahl + ")");
    //boolean result = ( zahl % 2 == 0 );
    //return result;
    return zahl % 2 == 0;
  }
  // ===============================================================================

  private static void shortcutOperators3() {
    String name = null;
    //String name = "Schmidt";
    if (name != null && name.length() < 8) { // & Operator würde bei [name = null] zu einem Fehler führen
      System.out.println("Der Name ist gültig.");
    } else {
      System.out.println("Der Name ist Ungültig!");
    }
  }
  // ===============================================================================
}
