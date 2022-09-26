package t03_deklarationen.p12_modifier.nonaccess.p01_abstract;

// abstract: nicht fertig (Unterklassen erwartet)
public abstract class Tier { // new Tier() NICHT erlaubt

  public abstract void sound(); // abstract: nicht fertig => Kein Rumpf

  public          void doSomething() { // non-abstract = concrete => Mit Rumpf
    System.out.println("doSomething() ...");
  }
}

// #####################################################################################
// #####################################################################################
// #####################################################################################

// non-abstract = concrete
/* non-abstract */ class Katze extends Tier { // Unterklasse von Tier

  @Override // abstrakte Methode der Superklasse überschreiben/implementieren/realisieren
  public void sound() {
    System.out.println("Miao");
  }

}


