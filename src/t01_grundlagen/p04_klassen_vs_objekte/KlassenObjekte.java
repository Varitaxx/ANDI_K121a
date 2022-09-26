package t01_grundlagen.p04_klassen_vs_objekte;

public class KlassenObjekte {
  
  public static void main(String[] args) {
    System.out.println();
    
    // new Auto() => Konstruktoraufruf: Instanziiert ein Auto-Objekt
    Auto auto1 = new Auto();
    Auto auto2 = new Auto();
    
    auto1.hersteller = "BMW";
    auto1.modell = "520i";
    
    auto2.hersteller = "VW";
    auto2.modell = "Passat Variant";
    
    auto1.printData();
    auto2.printData();
    
  }    

  
}




