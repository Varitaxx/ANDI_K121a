package t99_wbs_plan.t03_datentypen.p05_methoden.p04_call_by_value;

public class S01_CallByValueMitPrimitiven {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    int zahl = 12;
  
    manipulate(zahl); // Methodenaufruf mit Übergabe eines Arguments
    
    System.out.println("zahl: " + zahl); // 12
    
    
    System.out.println("======================= end of main() ======================");
  }
  
  private static void manipulate( int param ) {
    // Der Parameter param verhält sich wie eine lokale Variable,
    // die den Wert des Arguments des Methodenaufrufs Annimmt
    // Beim obigen Methodenaufruf => int param = 12;
    System.out.println("param: " + param);
    param = 30;
    System.out.println("param: " + param);
  }
  
}
