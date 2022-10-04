package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v2;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

  private List<Position> positionen;

  public Warenkorb() {
    positionen = new ArrayList<>();
  }

  public List<Position> getPositionen() {
    return positionen;
  }

  public void addPosition(Position position) {
    // position zum Array hinzufügen
    positionen.add(position);
  }

  public void setPositionen(List<Position> positionen) {
    this.positionen = positionen;
  }

  public float getGesamtNettoPreis() {
    float nettoPreis = 0;
    for( Position position : positionen ) {
      nettoPreis += position.getPositionNettoPreis();
    }
    return nettoPreis;
  }

  public void showOverview() {
    for( Position position : positionen ) {
      System.out.println(position); // position.toString()
    }
  }
}
