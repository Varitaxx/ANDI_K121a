package _test.s01_rechteck;

public class RechteckTest {
  
  public static void main( String[] args ) {
    Rechteck re1 = new Rechteck();
    re1.länge = 5;
    re1.breite = 2;
    double fläche = re1.fläche();
    System.out.println(fläche);
    double umfang = re1.umfang();
    System.out.println(umfang);
    
    // 1_000_000 Strings werden oft manipuliert
  }

}

