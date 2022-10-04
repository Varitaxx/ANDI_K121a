package t05_objektorientierung.aufgaben.aufgabe5D.v1.prisma;

public class Zylinder extends Prisma {

  // Grundfläche ist ein Kreis => Radius benötigt
  private double radius;

  public Zylinder(double radius, double höhe) {
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
  double getGrundfläche() {
    return Math.PI * radius * radius;  // PI * r²
  }

  @Override
  double getUmfang() {
    return 2 * Math.PI * radius;  // 2 * PI * r
  }

  @Override
  public void printInfo() {
    System.out.println("=====================================");
    System.out.println("                " + this.getClass().getSimpleName());
    System.out.println("=====================================");
    System.out.println("Radius         : " + radius);
    System.out.println("Höhe           : " + getHöhe());
    System.out.println("==========");
    System.out.println("Umfang         : " + getUmfang());
    System.out.println("Grundfläche    : " + getGrundfläche());
    System.out.println("==========");
    System.out.println("getOberfläche(): " + getOberfläche());
    System.out.println("getVolumen()   : " + getVolumen());
    System.out.println("=====================================");
  }
}
