package t05_objektorientierung.aufgaben.aufgabe5D.v2.pyramide;

public class ViereckPyramide extends Pyramide {

  private double länge;
  private double breite;

  public ViereckPyramide(double länge, double breite, double höhe) {
    super(höhe);
    this.länge = länge;
    this.breite = breite;
  }

  public double getLänge() {
    return länge;
  }

  public double getBreite() {
    return breite;
  }

  @Override
  public final double getGrundfläche() {
    return länge * breite;
  }

  @Override
  public double getMantelfläche() {
    double teil1 = länge * Math.sqrt(getHöhe() * getHöhe() + (breite * breite) / 4); // länge x QWurzel(höhe + breite/4)
    double teil2 = breite * Math.sqrt(getHöhe() * getHöhe() + (länge * länge) / 4);  // breite x QWurzel(höhe + länge/4)
    return teil1 + teil2;
  }

  @Override
  public void printFormInfo() {
    System.out.println("Länge          : " + länge);
    System.out.println("Breite         : " + breite);
    System.out.println("höhe           : " + getHöhe());
  }
}