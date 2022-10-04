package t05_objektorientierung.aufgaben.aufgabe5D.v1.pyramide;

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
  public void printInfo() {
    System.out.println("=====================================");
    System.out.println("                " + this.getClass().getSimpleName());
    System.out.println("=====================================");
    System.out.println("Länge          : " + länge);
    System.out.println("Breite         : " + breite);
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