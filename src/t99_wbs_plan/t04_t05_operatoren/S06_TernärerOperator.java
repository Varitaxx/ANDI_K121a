package t99_wbs_plan.t04_t05_operatoren;

public class S06_TernärerOperator {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    ohneTernärenOperator();
    //mitTernäremOperator();
    //mehrAlsZweiFallunterscheidungen();
    System.out.println("======================= end of main() ======================");
  }
  
  
  private static void mehrAlsZweiFallunterscheidungen() {
    int zahl = 2; // 0 -> rot, 1 -> gelb, 2 -> grün
    String farbe;
    if (zahl == 0)
      farbe = "rot";
    else if (zahl == 1)
      farbe = "gelb";
    else
      farbe = "grün";
    System.out.println("Die Ampel ist: " + farbe);
    System.out.println("============================================================");
    farbe = zahl == 0 ? "rot" : zahl == 1 ? "gelb" : "grün";
    System.out.println("Die Ampel ist: " + farbe);
    
  }
  private static void mitTernäremOperator() {
    int zahl = 4;
    String typ = zahl % 2 == 0 ? "gerade" : "ungerade";
    System.out.println("Zahl ist: " + typ);
    System.out.println("============================================================");
    // Kompakte Schreibweise
    System.out.println("Zahl ist: " + ( zahl % 2 == 0 ? "gerade" : "ungerade" ) );
  }
  
  private static void ohneTernärenOperator() {
    int zahl = 4;
    // int zahl = 5;
    String typ;
    // =============================================
    if (zahl % 2 == 0) {
      typ = "gerade";
    }
    else {
      typ = "ungerade";
    }
    System.out.println("Zahl ist: " + typ);
  }
  
}

