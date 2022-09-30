package t05_objektorientierung.p00_introduction;

public class Test {

  public static void main(String[] args) {
    ohneObjektOrientierung();
    mitObjektOrientierung();
  }

  private static void mitObjektOrientierung() {
    Auto auto = new Auto();
    auto.hersteller = "VW";
    auto.modell = "Golf";
    auto.printInfo();
  }

  // =================== Ohne Objektorientierung ===================
  private static void ohneObjektOrientierung() {
    String[] auto = {"VW", "Golf"}; // Nicht-Objektorientiert
    String[][] autoArray = { { "VW", "Golf" }, { "BMW", "320i" }, { "Fiat", "Panda" } };
    // Hersteller vom 2. Auto ausgeben
    System.out.println(autoArray[1][0]); // => BMW
    
    printInfo(auto);
  }

  public static void printInfo(String[] auto) {
    System.out.println(auto[0] + " " + auto[1]);
  }
  // ===============================================================

}

// ====================== Objektorientierung =======================
class Auto {
  String hersteller;
  String modell;

  public void printInfo() {
    System.out.println(hersteller + " " + modell);
  }
}