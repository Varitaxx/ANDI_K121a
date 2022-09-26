package t03_deklarationen.p08_enums.p02_example2;

public enum Color {
  // ; WICHITG
  // BLACK, WHITE, RED, GREEN, BLUE;           // Bei jeder Konstante wird der Konstruktor Color() aufgerufen
  // BLACK(), WHITE(), RED(), GREEN(), BLUE(); // Bei jeder Konstante wird der Konstruktor Color() aufgerufen
  BLACK(0,0,0), WHITE(255,255,255), RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255); // Bei jeder Konstante wird der Konstruktor Color() aufgerufen

  // Variablen-Deklarationen
  int r, g, b;
  String germanDesc;

  // Enum-Konstruktor nur "private" und "<default>" erlaubt
  //  private Color() { }  // Der implizite Konstruktor
  private Color() {
    System.out.println("Color() - Constructor: " + this.name());
  }

  private Color(int r, int g, int b) {
    System.out.println("Color(int,int,int) - Constructor " + this.name());
    this.r = r;
    this.g = g;
    this.b = b;
  }

  // Methoden-Deklarationen
  public int getR() {
    return r;
  }

//  public Color setR(int r) {
//    this.r = r;
//    return this;
//  }

  public int getG() {
    return g;
  }

//  public Color setG(int g) {
//    this.g = g;
//    return this;
//  }

  public int getB() {
    return b;
  }

//  public Color setB(int b) {
//    this.b = b;
//    return this;
//  }

  public String getGermanDesc() {
    return germanDesc;
  }

//  public Color setGermanDesc(String germanDesc) {
//    this.germanDesc = germanDesc;
//    return this;
//  }

  // Innere Typdeklarationen
  class InnerClass {}
  interface InnerInterface {}
  enum InnerEnum {}
  @interface InnerAnnotation {}
}


