package _test;


import java.util.Arrays;
import java.util.List;

public class AutoTest {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    mitOO();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void mitOO() {
    Auto auto1 = new Auto();
    auto1.hersteller = "VW";
    auto1.modell = "Golf";
    //Auto auto1 = new Auto("VW", "Golf");
    //auto1.printData();
    
    
    Auto auto2 = new Auto("BMW", "520");
    Auto auto3 = new Auto("A", "99");
    Auto auto4 = new Auto("B", "88");
    List<Auto> autoListe = Arrays.asList(auto1, auto2, auto3, auto4 );
    for (Auto auto : autoListe ) {
      auto.printData();
    }
  }
}
