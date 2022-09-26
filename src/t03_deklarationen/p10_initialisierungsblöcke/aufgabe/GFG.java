package t03_deklarationen.p10_initialisierungsblöcke.aufgabe;

// A tricky Java code to predict the output
// based on order of 
// execution of constructors, static 
// and initialization blocks

class MyTest {
  private static int sum;
  private static boolean initialized = false;

  static {
    initialize();
  }

  public static int getSum() {
    initialize();
    return sum;
  }

  private static void initialize() {
    if (!initialized) {
      for( int i = 0 ; i < 5 ; i++ )
        sum += i;
      initialized = true;
    }
  }
}

public class GFG {
  public static void main(String[] args) {
    System.out.println(MyTest.getSum()); // 10
    System.out.println(MyTest.getSum()); // 10
  }
}