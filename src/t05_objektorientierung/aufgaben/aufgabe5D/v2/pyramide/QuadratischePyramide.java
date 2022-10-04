package t05_objektorientierung.aufgaben.aufgabe5D.v2.pyramide;


public class QuadratischePyramide extends ViereckPyramide {
  private double kante;
  
  public QuadratischePyramide(double kante, double höhe) {
    super(kante, kante, höhe);
    this.kante = kante;
  }


  // Optional (nur zur Optimierung der Performance)
  @Override 
  public double getMantelfläche() {
    // 2 * kante * QWurzel(höhe + kante²/4);
    return 2 * getLänge() * Math.sqrt(getHöhe() * getHöhe() + (getLänge() * getLänge()) / 4)  ;
  }

  @Override
  public void printFormInfo() {
    System.out.println("Kante          : " + kante);
    System.out.println("höhe           : " + getHöhe());
  }

}
