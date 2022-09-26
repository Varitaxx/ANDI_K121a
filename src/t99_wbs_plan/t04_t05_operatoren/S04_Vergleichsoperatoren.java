package t99_wbs_plan.t04_t05_operatoren;

public class S04_Vergleichsoperatoren {
  
  public static void main(String[] args) {
    // ==   !=   <   <=   >   >=
    int a = 10;
    int b = 5;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("=====================");
    System.out.println("a < 20 : " + (a < 20));  // true
    System.out.println("a < b  : " + (a < b));   // false
    System.out.println("a == b : " + (a == b));  // false
    System.out.println("a != b : " + (a != b));  // true
    System.out.println("a >= 10: " + (a >= 10)); // true
    System.out.println("============================================================");
    aufpassen();

  }
  
  private static void aufpassen() {
    boolean bedingung = false;

    if ( bedingung = true ) { // Achtung, das ist eine Zuweisung
      System.out.println("Block 1");
    } else {
      System.out.println("Block 2");
    }
    // =============================================================================
    if ( bedingung == true ) { /* ... */}  // Ok, aber redundant
    
    if ( bedingung ) { /* ... */}  // So macht man das !!!
  }
  
}
