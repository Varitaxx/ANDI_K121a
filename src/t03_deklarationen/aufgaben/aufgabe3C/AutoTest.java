package t03_deklarationen.aufgaben.aufgabe3C;

public class AutoTest {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    Auto auto1 = new Auto("VW","Golf 7", Farbe.BLAU, Getriebe.GANGSCHALTUNG,
                          Antrieb.VORDER, Kraftstoff.BENZIN, 8, 2000);

    Auto auto2 = new Auto("BMW","520i", Farbe.SCHWARZ, Getriebe.AUTOMATIK,
                          Antrieb.HECK, Kraftstoff.DIESEL, 16, 3500);
    
    auto1.printInfo();
    auto2.printInfo();
    
    
    
    
    System.out.println("======================= end of main() ======================");
  }
  
}
