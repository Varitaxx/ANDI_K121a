package t05_objektorientierung.aufgaben.aufgabe5D.v1.prisma;

public class Würfel extends Quader {

  public Würfel(double kante) {
    super(kante, kante, kante);

  }

  @Override
  public void printInfo() {
    System.out.println("=====================================");
    System.out.println("                " + this.getClass().getSimpleName());
    System.out.println("=====================================");
    System.out.println("Länge          : " + getLänge());
    System.out.println("Breite         : " + getLänge());
    System.out.println("Höhe           : " + getLänge());
    System.out.println("==========");
    System.out.println("Umfang         : " + getUmfang());
    System.out.println("Grundfläche    : " + getGrundfläche());
    System.out.println("==========");
    System.out.println("getOberfläche(): " + getOberfläche());
    System.out.println("getVolumen()   : " + getVolumen());
    System.out.println("=====================================");
  }
}
