package t05_objektorientierung.p01_design_prinzipien.p01_kapselung;

public class Test {

  public static void main(String[] args) {
    Auto auto = new Auto();
    // auto.hersteller = "VW"; // COMPILER-Fehler, da Variable "private" ist
    auto.setHersteller("VW");
    auto.setModell("Golf");
    auto.printInfo();
  }
}

// ====================== Objektorientierung =======================
class Auto {
  // Kapselung: Alle Variablen (Daten) + Methoden (die darauf zugreifen) zusammen bringen
  //            Variablen "private", Methoden "public"
  private String hersteller;
  private String modell;

  public String getHersteller() {
    return hersteller;
  }

  public void setHersteller(String hersteller) {
    this.hersteller = hersteller;
  }

  public String getModell() {
    return modell;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }

  public void printInfo() {
    System.out.println(hersteller + " " + modell);
  }
}