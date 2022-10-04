package t05_objektorientierung.aufgaben.Aufgabe5B.teil2_zusatz;

public class Test {

  public static void main(String[] args) {

    PC pc1 = new PC("HP Pavillon 20", 3.5, 4, 620); // Alternative
    PC pc2 = new PC("Acer Sonnenschirm 510", 2.4, 8, 500);
    PC pc3 = new PC("IBM Super Tech 12", 1.9, 16, 256);

    pc1.starten();
    pc2.runterfahren();
    pc3.inSchlafModusGehen();

    System.out.println("===============================================================");

    pc1.printData();
    pc2.printData();
    pc3.printData();

    System.out.println("===============================================================");
  }
}
