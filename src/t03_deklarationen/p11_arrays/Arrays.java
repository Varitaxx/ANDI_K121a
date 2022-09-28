package t03_deklarationen.p11_arrays;

public class Arrays {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    deklarationInitialisierung();
    System.out.println("======================= end of main() ======================");
  }
  
  private static void deklarationInitialisierung() {
    // Deklaration
    int[] xArray;
    int yArray[];
    //int[][] zArray; // 2-dim Array
    int[] zArray[]; // Alternative
    
    // Deklaration + Initialisierung
    int[] aArray = null; // Array ist ein Referenztyp
    int[] bArray = new int[5]; // <=> { 0 , 0 , 0 , 0 , 0 }
    
  }
  
}
