package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher;

import java.util.List;
// Kapselung, Hohe Kohäsion, Schwache Koppelung !!!!!!!!!!!!!!!!!!!!!!!!!
// ===============================================================================
class Position {
  private float preis;
  private int menge;
  
  public float getPreis() {
    return preis;
  }
  
  public void setPreis( float preis ) {
    this.preis = preis;
  }
  
  public int getMenge() {
    return menge;
  }
  
  public void setMenge( int menge ) {
    this.menge = menge;
  }
  
  public float getPositionPreis() {
    return preis * menge;
  }
  
}
// ===============================================================================
class Warenkorb {
  private List<Position> positionen;
  
  public List<Position> getPositionen() {
    return positionen;
  }
  
  public void setPositionen( List<Position> positionen ) {
    this.positionen = positionen;
  }
  
  public float getNettoPreis() {
    float netto = 0.0f;
    for( Position pos : positionen ) {
      //netto += pos.getPreis() * pos.getMenge();
      netto += pos.getPositionPreis();
    }
    return netto;
  }
  
}
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
