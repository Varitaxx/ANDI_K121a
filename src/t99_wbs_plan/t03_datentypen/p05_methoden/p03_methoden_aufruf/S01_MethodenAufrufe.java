package t99_wbs_plan.t03_datentypen.p05_methoden.p03_methoden_aufruf;

public class S01_MethodenAufrufe {

  public static void main(String[] args) {
    startAusgabe();
    zeilenAusgabe();
    endAusgabe();
  }

  public static void startAusgabe() {
    System.out.println("##### START #####");
  }

  public static void zeilenAusgabe() {
    for( int i = 1 ; i < 10 ; i++ ) {
      System.out.println("Zeile: " + i);
    }
  }

  public static void endAusgabe() {
    System.out.println("##### END  #####");
  }





}
