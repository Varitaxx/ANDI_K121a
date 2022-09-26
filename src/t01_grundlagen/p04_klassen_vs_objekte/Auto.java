package t01_grundlagen.p04_klassen_vs_objekte;

public class Auto {
  public String hersteller;   // Instanzvariable (non-static)
  public String modell;       // Instanzvariable (non-static)
  
  public void printData() {  // Instanzmethode (non-static)
    System.out.println("============ Kfz-Daten ============");
    System.out.println("Hersteller: " + hersteller);
    System.out.println("Modell: " + modell);
    System.out.println("===================================");
  }

}
