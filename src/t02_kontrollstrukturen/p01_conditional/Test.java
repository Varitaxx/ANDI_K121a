package t02_kontrollstrukturen.p01_conditional;

public class Test {
  
  public static void main( String[] args ) {
    // Ganzahlen: byte, short, int, long
    // Fließkommazahlen: float, double
    //long summe = 0;
    
    //for( long i = 1 ; i <= 10 ; i++ ) {
    //  summe = summe + i;
    //}
    long summe = 0;
    for( long i = 1 ; i <= 10 ; summe += i, i++ ) { }
  
    System.out.println("Summe: " + summe);
    
    
    
  }
  
  
  
}
