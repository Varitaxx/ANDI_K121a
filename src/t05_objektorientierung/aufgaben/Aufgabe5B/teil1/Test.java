package t05_objektorientierung.aufgaben.Aufgabe5B.teil1;

public class Test {
  public static void main(String[] args) {
//    PC pc1 = new PC();
//    pc1.setBezeichnung("HP Pavillon 20");
//    pc1.setProzessorGeschwindigkeit(3.5);
//    pc1.setRam(4);
//    pc1.setFestplattengröße(620);

    PC pc1 = new PC("HP Pavillon 20", 3.5, 4, 620); // Alternative
    PC pc2 = new PC("Acer Sonnenschirm 510", 2.4, 8, 500);
    PC pc3 = new PC("IBM Super Tech 12", 1.9, 16, 256);

    pc1.printData();
    pc2.printData();
    pc3.printData();

    System.out.println("===============================================================");

    pc1.starten();
    pc1.inSchlafModusGehen();
    pc1.starten();
    pc1.runterfahren();

    System.out.println("===============================================================");
  }
}
