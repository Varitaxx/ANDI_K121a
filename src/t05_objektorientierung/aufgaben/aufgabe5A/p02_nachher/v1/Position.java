package t05_objektorientierung.aufgaben.aufgabe5A.p02_nachher.v1;

public class Position {
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