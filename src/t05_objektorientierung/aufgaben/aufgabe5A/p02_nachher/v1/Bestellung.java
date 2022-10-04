package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v1;

import java.util.List;
// Kapselung, Hohe Kohäsion, Schwache Koppelung !!!!!!!!!!!!!!!!!!!!!!!!!
// ===============================================================================

// ===============================================================================
// ===============================================================================
public class Bestellung {

  private Warenkorb warenkorb;
  private float mwSt;
  
  public Bestellung( Warenkorb warenkorb, float mwSt ) {
    this.warenkorb = warenkorb;
    this.mwSt = mwSt;
  }
  
  public float getGesamtPreis() {
    //float netto = warenkorb.getNettoPreis();
    //float brutto = netto * ( 1 +  mwSt); // Brutto-Preis
    //return brutto;
    return warenkorb.getNettoPreis() * ( 1 +  mwSt); // Brutto-Preis
  }
}
// ===============================================================================
