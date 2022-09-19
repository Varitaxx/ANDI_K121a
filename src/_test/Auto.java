package _test;

public class Auto {
  
  public String hersteller;   // Instanzvariable (non-static)
  public String modell;       // Instanzvariable (non-static)
  //public String ...;       // Instanzvariable (non-static)
  
  public Auto() {
  }
  
  public Auto( String hersteller, String modell ) {
    this.hersteller = hersteller;
    this.modell = modell;
  }
  
  public void printData() {  // Instanzmethode (non-static)
    System.out.println("============ Kfz-Daten ============");
    System.out.println("Hersteller: " + hersteller);
    System.out.println("Modell: " + modell);
    System.out.println("===================================");
  }

}
