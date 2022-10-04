package t05_objektorientierung.aufgaben.aufgabe5D.v2.prisma;

public class Würfel extends Quader {

  private double kante; // Kein Muss, nur für die Lesbarkeit

  public Würfel(double kante) {
    super(kante, kante, kante);
    this.kante = kante;
  }

  @Override
  public void printFormInfo() {
    System.out.println("Kante          : " + kante);
  }
}
