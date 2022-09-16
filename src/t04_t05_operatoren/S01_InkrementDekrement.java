package t04_t05_operatoren;

public class S01_InkrementDekrement {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    int a = 3;
    ++a; // 4
    System.out.println("a: " + a); // 4
    System.out.println("============================================================");
    // *** Post-Inkrement ***
    a = 4;
    int res = 9 + a++; // <=> int res = 9 + a und danach a = a + 1
    System.out.println("res: " + res); // 13
    System.out.println("a: " + a);     // 5
    System.out.println("============================================================");
    // *** Pre-Inkrement ***
    a = 4;
    res = 9 + ++a; // <=> a = a + 1 und danach res = 9 + a
    System.out.println("res: " + res); // 14
    System.out.println("a: " + a);     // 5
    System.out.println("======================= end of main() ======================");
  }
  
}
