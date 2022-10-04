package t05_objektorientierung.p03_interfaces.p02_default_static;

public class MyClass implements MyInterface {

  // Die Klasse MyClass ist konkret (nicht abstrakt) =>
  // Sie muss alle abstrakten Methoden von allen Supertypen überschreiben

  @Override
  public void m1() { } // Ein Body ist notwendig

  @Override
  public void m2() { } // Ein Body ist notwendig

  @Override
  public void m3() { } // Ein Body ist notwendig
  
  @Override // Man MUSS NICHT diese Methode überschreiben, aber man KANN
  public void defaultMethod() {
    MyInterface.super.defaultMethod(); // bei Bedarf
  }
  
  // Eigene Version von staticMethod(): KEINE ÜBERSCHREIBUNG
  public static void staticMethod() { }
}
