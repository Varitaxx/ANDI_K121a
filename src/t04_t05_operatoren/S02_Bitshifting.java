package t04_t05_operatoren;

public class S02_Bitshifting {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    int zahl = 48;
    int res1 = zahl >> 3; // Bitshifting um 3 Stellen nach rechts => Teilung durch 2³
    System.out.println("res1: " + res1); // 6  ( = 48 / 2³ )
    System.out.println("============================================================");
    int res2 = zahl << 3; // Bitshifting um 3 Stellen nach links => Multiplikation mit 2³
    System.out.println("res2: " + res2); // 384 ( = 48 * 2³)
    System.out.println("======================= end of main() ======================");
  }
  
}
