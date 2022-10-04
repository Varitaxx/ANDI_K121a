package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v1;

import java.util.List;

public class Warenkorb {
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
