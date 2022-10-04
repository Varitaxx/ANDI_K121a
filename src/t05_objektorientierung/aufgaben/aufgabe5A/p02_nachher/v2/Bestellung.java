package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v2;

public class Bestellung {

  private Warenkorb warenkorb;
  private float mwSt; // 0,19

  public Bestellung(Warenkorb warenkorb, float mwSt) {
    this.warenkorb = warenkorb;
    this.mwSt = mwSt;
  }

  public float getGesamtPreis() { // Rechnungsbetrag Brutto
    float nettoPreis = warenkorb.getGesamtNettoPreis();
    // brutto = netto * (1 + mwst)
    return  nettoPreis * (1 + mwSt); // netto * 1,19
  }

  public void printBestellübersicht() {
    warenkorb.showOverview();
    float brutto = getGesamtPreis();
    System.out.println("===============================================================");
    System.out.format("Gesamtbestellpreis: %41.2f €%n", brutto);
  }

}
