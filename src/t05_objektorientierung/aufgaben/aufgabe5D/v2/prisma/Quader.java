package t05_objektorientierung.aufgaben.aufgabe5D.v2.prisma;

public class Quader extends Prisma {

private double länge;
private double breite;

  public Quader(double länge, double breite, double höhe) {
    super(höhe);  // Aufruf des Prisma-Konstruktors
    this.länge = länge;
    this.breite = breite;
  }

  public double getLänge() {
    return länge;
  }

  public void setLänge(double länge) {
    this.länge = länge;
  }

  public double getBreite() {
    return breite;
  }

  public void setBreite(double breite) {
    this.breite = breite;
  }

  @Override
  public double getGrundfläche() {
    return länge * breite;
  }

  @Override
  public double getUmfang() {
    return (länge + breite) * 2;
  }

  @Override
  public void printFormInfo() {
    System.out.println("Länge          : " + länge);
    System.out.println("Breite         : " + breite);
    System.out.println("Höhe           : " + getHöhe());
  }
}
