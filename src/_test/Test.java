package _test;


import java.util.Arrays;
import java.util.List;

public class Test {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    ohneOO();
    System.out.println("======================= end of main() ======================");
  }
  

  
  
  
  private static void ohneOO() {
    // hersteller, modell, getriebe, kraftstoff, ....
    
    String[][] autos = new String[10][40];
    //                         0      1       2     3
    autos[0] = new String[] { "VW", "Golf", "...", "...","..." }; // 1.Auto
    autos[1] = new String[] { "BMW", "520", "...", "...","..." }; // 2.Auto
    autos[2] = new String[] { "A", "4", "...", "...","..." }; // 3.Auto
    
    
    System.out.println(autos[1][1]); // hersteller ???, modell??, Auto
    printAutoInfos(autos[1]); // BMW
  }
  
  public static void printAutoInfos(String[] auto) {
    System.out.println("Hersteller : " + auto[0]);
    System.out.println("Modell     : " + auto[1]);
    System.out.println("Getriebe   : " + auto[2]);
  }
  

  
}
