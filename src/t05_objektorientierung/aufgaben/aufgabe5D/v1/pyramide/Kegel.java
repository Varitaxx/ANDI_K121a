package t05_objektorientierung.aufgaben.aufgabe5D.v1.pyramide;


public class Kegel extends Pyramide {
  
  private double radius;
  
  public Kegel(double radius, double höhe) {
    super(höhe);
    this.radius = radius;
  }

  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getGrundfläche() {
    return Math.PI * Math.pow(radius, 2); // PI * r2;
  }

  @Override
  public double getMantelfläche() {
    return Math.PI * radius * Math.sqrt(getHöhe() * getHöhe() + radius * radius);  // PI  * r  * QWurzel(höhe + radius);
  }

  @Override
  public void printInfo() {
    // TODO
  }
}
