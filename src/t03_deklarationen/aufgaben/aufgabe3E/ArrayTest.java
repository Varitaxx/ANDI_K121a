package t03_deklarationen.aufgaben.aufgabe3E;

public class ArrayTest {
  
  static double[] zahlen = { 4.5, 78, 23.9, 12.7, 88 };
  public static void main( String[] args ) {
    System.out.println("============================================================");
    //lösung1();
    lösung2();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void lösung2() {
    double summe = 0;
  
    double plusMinus = 0;
    for( int i = 0 ; i < zahlen.length ; i++ ) {
      if (i % 2 == 0) // wenn i gerade Zahl ist
        plusMinus = plusMinus + zahlen[i];
      else            // i ist ungerade
        plusMinus = plusMinus - zahlen[i];
      summe = summe + zahlen[i];
    }
    System.out.format("Reguläre Summe  : %10.2f %n",summe);
    System.out.format("Plus-Minus-Summe: %10.2f %n",plusMinus);
  }
  
  private static void lösung1() {
    double summe = 0;
    for ( double zahl : zahlen ) { // foreach-Syntax (enhanced for loop)
      summe = summe + zahl; // summe += zahl;
    }
    //System.out.println("Summe: " + summe);
    System.out.format("Summe: %10.2f %n",summe);
    
    double plusMinus = 0;
    for( int i = 0 ; i < zahlen.length ; i++ ) {
      if (i % 2 == 0) // wenn i gerade Zahl ist
        plusMinus = plusMinus + zahlen[i];
      else            // i ist ungerade
        plusMinus = plusMinus - zahlen[i];
    }
    //System.out.println("Plus-Minus-Summe: " + plusMinus);
    System.out.format("Plus-Minus-Summe: %10.2f %n",plusMinus);
    // Zur Kontrolle
    //System.out.println(4.5 - 78 + 23.9 - 12.7 + 88 ); // 25.7 (OK)
  }
  
  public static void formatTest() {
    String name = "Peter";
    int alter = 34;
    // (%s = String), (%d = decimal), (%f = floating point), (%n = Zeilenumbruch)
    System.out.println("Mein Name ist " + name + ". Ich bin " + alter + " Jahre alt.");
    System.out.format("Mein Name ist %s. Ich bin %d Jahre alt.%n", name, alter);
  }
  
}
