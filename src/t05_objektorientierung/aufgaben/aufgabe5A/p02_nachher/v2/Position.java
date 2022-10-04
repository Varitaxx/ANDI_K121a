package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v2;

public class Position {
  // =============================================================
  // Artikelbeschreibung und MwSt werden durch artikelId ermittelt
  // private int artikelId;
  // private int rabatt; // 10%
  // =============================================================

  private String beschreibung;
  private float preis; // 15 €
  private int menge;   // 3

  public Position(String beschreibung, float preis, int menge) {
    this.beschreibung = beschreibung;
    this.preis = preis;
    this.menge = menge;
  }

  public float getArtikelPreis() {
    return preis;
  }

  public void setPreis(float preis) {
    this.preis = preis;
  }

  public int getMenge() {
    return menge;
  }

  public void setMenge(int menge) {
    this.menge = menge;
  }

  public float getPositionNettoPreis() {
    return preis * menge;
  }

  @Override
  public String toString() {
    return String.format("%-30s - Menge: %d - %6.2f € - %6.2f €", beschreibung, menge, preis, getPositionNettoPreis());
  }
}
