package t03_deklarationen.p12_modifier.nonaccess.p02_final;


public class Tier {

  // Eine Methode ist "final" => Darf nicht überschrieben werden (in den Unterklassen)
  public final void doSomething() {
    System.out.println("Tier.doSomething() ...");
  }

}

// #####################################################################################
// #####################################################################################
// #####################################################################################

class Katze extends Tier { // FEHLER, wenn Tier "final" wäre

  // NICHT erlaubt, da Methode in der Superklasse "final" ist.
//  public void doSomething() {
//    System.out.println("Katze.doSomething() ...");
//  }

}

// #####################################################################################
// #####################################################################################
// #####################################################################################
// final: abgeschlossen   (Unterklassen NICHT erlaubt)
final class Super { }
// =============================================================================
//class Unterklasse extends Super { } // NICHT erlaubt, da Super "final" ist
// =============================================================================
