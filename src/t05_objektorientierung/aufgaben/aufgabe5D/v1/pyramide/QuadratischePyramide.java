package t05_objektorientierung.aufgaben.aufgabe5D.v1.pyramide;


public class QuadratischePyramide extends ViereckPyramide {
  
  public QuadratischePyramide(double kante, double höhe) {
    super(kante, kante, höhe);
  }


  // Optional (nur zur Optimierung der Performance)
  @Override 
  public double getMantelfläche() {
    // 2 * kante * QWurzel(höhe + kante²/4);
    return 2 * getLänge() * Math.sqrt(getHöhe() * getHöhe() + (getLänge() * getLänge()) / 4)  ;
  }
  @Override
  public void printInfo() {
    System.out.println("=====================================");
    System.out.println("                " + this.getClass().getSimpleName());
    System.out.println("=====================================");
    System.out.println("Länge          : " + getLänge());
    System.out.println("Breite         : " + getBreite());
    System.out.println("höhe           : " + getHöhe());
    System.out.println("==========");
    System.out.println("Umfang         : " + getMantelfläche()); // Einziger Unterschied zu Quader
    System.out.println("Grundfläche    : " + getGrundfläche());
    System.out.println("==========");
    System.out.println("getOberfläche(): " + getOberfläche());
    System.out.println("getVolumen()   : " + getVolumen());
    System.out.println("=====================================");
  }

}
