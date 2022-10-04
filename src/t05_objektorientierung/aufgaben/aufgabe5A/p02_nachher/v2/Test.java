package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v2;

public class Test {
  public static void main(String[] args) {

    Warenkorb warenkorb = new Warenkorb();
    warenkorb.addPosition(new Position("Logitech Maus M185", 19.50f, 2));
    warenkorb.addPosition(new Position("Cherry Tastatur", 25f, 3));
    warenkorb.addPosition(new Position("Keramiktasse Java Style", 8.70f, 1));
    warenkorb.addPosition(new Position("Monitor Dell U2414", 250f, 2));

    Bestellung bestellung = new Bestellung(warenkorb, 0.19f);

    bestellung.printBestellübersicht();
  }
}
