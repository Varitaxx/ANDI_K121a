package t05_objektorientierung.aufgaben.aufgabe3A.p01_vorher;

import java.util.List;

class Position {
  
  public float preis;
  public int menge;
  
}

class Warenkorb {
  public List<Position> positionen;
}

public class Bestellung {
  
  private Warenkorb warenkorb;
  private float mwSt;
  
  public Bestellung( Warenkorb warenkorb, float mwSt ) {
    this.warenkorb = warenkorb;
    this.mwSt = mwSt;
  }
  
  public float getGesamtPreis() {
    float gesamtPreis = 0;
    for( Position position : warenkorb.positionen ) {
      gesamtPreis += position.preis * position.menge;
    }
    gesamtPreis += gesamtPreis * mwSt;
    return gesamtPreis;
  }
  
}
