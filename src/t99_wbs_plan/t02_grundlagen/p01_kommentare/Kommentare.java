package t99_wbs_plan.t02_grundlagen.p01_kommentare;
/**
 * 
 * @author Salah
 *
 */
public class Kommentare {
  
  // Zeilenkommentar
  public void method( int /*Blockkommentar*/ zahl ) { // Zeilenkommentar
    System.out.println("S01_CallByValueMitPrimitiven");
    /*
    Blockkommentar
    */
    
  }
  
  
  /**
   * Summiert zweier Zahlen (Parameter)
   * @param a erste Zahl
   * @param b zweite Zahl
   * @return Summe beider Zahlen
   */
  public int summe(int a, int b) {
    return a + b;
  }
  
}
